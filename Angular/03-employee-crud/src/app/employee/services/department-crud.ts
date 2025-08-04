import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Department } from '../domain/department';

@Injectable({
  providedIn: 'root'
})
export class DepartmentCrud {
  baseURL: string = 'http://localhost:8181/departmentapi/';

  constructor(private httpClient: HttpClient) {
  }

  getAllDepartments(): Observable<Department[]> {
    return this.httpClient.get<Department[]>(this.baseURL + "departments");
  }

}
