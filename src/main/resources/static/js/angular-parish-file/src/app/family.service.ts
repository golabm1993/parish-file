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

  delete(family: Family | number): Observable<Family> {
    const id = typeof family === 'number' ? family : family.id;
    const url = `${this.url}/${id}`;
    return this.httpClient.delete<Family>(url, httpOptions);
  }

  update(family: Family | number, family2: Family): Observable<any> {
    const id = typeof family == 'number' ? family : family.id;
    const url = `${this.url}/${id}`;
    return this.httpClient.put(url, family2, httpOptions);
  }
}
