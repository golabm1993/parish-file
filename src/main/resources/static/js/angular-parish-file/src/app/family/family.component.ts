import {Component, Input, OnInit} from '@angular/core';
import {FamilyService} from "../family.service";
import {Family} from "../family";

@Component({
  selector: 'app-family',
  templateUrl: './family.component.html',
  styleUrls: ['./family.component.css']
})
export class FamilyComponent implements OnInit {

  @Input() family: Family;

  families: Family[];

  familyToUpdate = {} as Family;

  newFamily = {} as Family;

  p: Number = 1;

  count: Number = 5;

  constructor(private familyService: FamilyService) { }

  getFamilies(): void {
    this.familyService.get().subscribe(families => this.families = families);
  }

  save() {
    this.familyService.save(this.newFamily)
      .subscribe(family => {
        this.families.push(family);
      });
  }

  delete(family: Family): void {
    this.families = this.families.filter(f => f !== family);
    this.familyService.delete(family).subscribe();
  }

  update(): void {
    let updateItem = this.families.find(this.findIndexToUpdate, this.familyToUpdate.id);
    let index = this.families.indexOf(updateItem);
    this.familyService.update(this.familyToUpdate)
      .subscribe(family => this.families[index] = family);
  }

  findIndexToUpdate(newItem) {
    return newItem.id === this;
  }

  passData(family: Family): void {
    // Object.keys(family).forEach((prop)=> console.log(typeof family[prop]));

    this.familyToUpdate.id = family.id;
    this.familyToUpdate.surname = family.surname;
    this.familyToUpdate.address = family.address;
    this.familyToUpdate.phoneNumber = family.phoneNumber;
    this.familyToUpdate.lastPastoralVisit = family.lastPastoralVisit;
  }

  ngOnInit() {
    this.getFamilies();
  }
}
