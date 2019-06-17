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

  constructor(private familyService: FamilyService) { }

  getFamilies(): void {
    this.familyService.get().subscribe(families => this.families = families);
  }

  save(surname: string, address: string, phoneNumber: string, lastPastoralVisit: string) {
    this.familyService.save({surname, address, phoneNumber, lastPastoralVisit} as Family)
      .subscribe(family => {
        this.families.push(family);
      });
  }

  delete(family: Family): void {
    this.families = this.families.filter(f => f !== family);
    this.familyService.delete(family).subscribe();
  }

  update(id: string, surname: string, address: string, phoneNumber: string, lastPastoralVisit: string): void {
    let updateItem = this.families.find(this.findIndexToUpdate, +id);
    let index = this.families.indexOf(updateItem);
    this.familyService.update(+id, {surname, address, phoneNumber, lastPastoralVisit} as Family)
      .subscribe(family => this.families[index] = family);
  }

  findIndexToUpdate(newItem) {
    return newItem.id === this;
  }

  ngOnInit() {
    this.getFamilies();
  }
}
