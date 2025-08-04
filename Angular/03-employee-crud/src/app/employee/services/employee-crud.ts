import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../domain/employee';
import { ResponseDTO } from '../domain/responseDTO';

@Injectable({
  providedIn: 'root'
})
export class EmployeeCrud {
  baseURL: string = 'http://172.27.4.117:8181/employeecrudapi/';

  constructor(private httpClient: HttpClient) {
  }

  updateEmployee(employee: Employee) : Observable<ResponseDTO> {
    return this.httpClient.put<ResponseDTO>(this.baseURL + 'employees/employee', employee);
  }

  getSingleEmployee(employeeId: string) : Observable<Employee> {
    return this.httpClient.get<Employee>(this.baseURL + 'employees/' + employeeId);
  }

  deleteEmployee(employeeId: string) : Observable<boolean> {
    return this.httpClient.delete<boolean>(this.baseURL+ 'employees/' + employeeId);
  } 

  addNewEmployee(employee: Employee): Observable<ResponseDTO> {
    return this.httpClient.post<ResponseDTO>(this.baseURL + 'employees/employee', employee);
  }

  getAllEmployees(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(this.baseURL + 'employees');
  }
}
