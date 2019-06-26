import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Family} from "./family";
import {Observable} from "rxjs";

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable({
  providedIn: 'root'
})
export class FamilyService {

  private url = "http://localhost:8080/family";

  constructor(private httpClient: HttpClient) {
  }

  get(): Observable<Family[]> {
    return this.httpClient.get<Family[]>(this.url);
  }

  save(family: Family): Observable<Family> {
    return this.httpClient.post<Family>(this.url, family, httpOptions);
  }

  delete(familyId: number): Observable<number> {
    const url = `${this.url}/${familyId}`;
    return this.httpClient.delete<number>(url, httpOptions);
  }

  update(family: Family): Observable<any> {
    return this.httpClient.put(this.url, family, httpOptions);
  }
}
