import { Component, OnInit } from '@angular/core';
import { Department } from '../domain/department';
import { Employee } from '../domain/employee';
import { ResponseDTO } from '../domain/responseDTO';
import { ActivatedRoute, Router } from '@angular/router';
import { DepartmentCrud } from '../services/department-crud';
import { EmployeeCrud } from '../services/employee-crud';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-update-employee',
  imports: [CommonModule, FormsModule],
  templateUrl: './update-employee.html',
  styleUrl: './update-employee.css'
})
export class UpdateEmployee implements OnInit {
  employeeId: string = '';
  departments: Department[] = [];
  employee: Employee = new Employee();
  responseDTO: ResponseDTO = new ResponseDTO();
  isVisible: boolean = false;
  states: string[] = ['Andhra Pradesh', 'Arunachal Pradesh', 'Assam', 'Bihar', 'Chhattisgarh', 'Goa', 'Gujarat', 'Haryana', 'Himachal Pradesh', 'Jharkhand', 'Karnataka', 'Kerala', 'Madhya Pradesh', 'Maharashtra', 'Manipur', 'Meghalaya', 'Mizoram', 'Nagaland', 'Odisha', 'Punjab', 'Rajasthan', 'Sikkim', 'Tamil Nadu', 'Telangana', 'Tripura', 'Uttar Pradesh', 'Uttarakhand', 'West Bengal'];
  constructor(private router: Router, private departmentCrud: DepartmentCrud, private employeeCrud: EmployeeCrud, private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.employeeId = this.activatedRoute.snapshot.params['employeeId'];
    this.getEmployee(this.employeeId);
    this.loadAllDepartments();
  }

  updateEmployee() {
    this.employeeCrud.updateEmployee(this.employee).subscribe({
      next: (response) => {
        this.responseDTO = response;
        console.log(this.responseDTO);
        this.isVisible= true;
      },
      error: (err) => {
        console.log("Error while calling API");
      },
      complete: () => {
        console.log("API call completed successfully!");
      }
    });
  }

  getEmployee(employeeId: string) {
    this.employeeCrud.getSingleEmployee(employeeId).subscribe({
      next: (response) => {
        this.employee = response
        console.log(this.employee);
      },
      error: (err) => {
        console.log("Error while calling API");
      },
      complete: () => {
        console.log("API call completed successfully!");
      }
    });
  }

  backToHome() {
    this.router.navigate(['employees']);
  }

  loadAllDepartments() {
    this.departmentCrud.getAllDepartments().subscribe({
      next: (response) => {
        this.departments = response;
        console.log(this.departments);
      },
      error: (err) => {
        console.log("Exception while calling Department API");
      },
      complete: () => {
        console.log("All departments retrived successfully!");
      }
    });
  }
}
