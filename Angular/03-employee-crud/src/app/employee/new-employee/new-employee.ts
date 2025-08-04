import { Component, OnInit } from '@angular/core';
import { Department } from '../domain/department';
import { DepartmentCrud } from '../services/department-crud';
import { CommonModule } from '@angular/common';
import { Employee } from '../domain/employee';
import { FormsModule } from '@angular/forms';
import { ResponseDTO } from '../domain/responseDTO';
import { EmployeeCrud } from '../services/employee-crud';
import { Router } from '@angular/router';

@Component({
  selector: 'app-new-employee',
  imports: [CommonModule, FormsModule],
  templateUrl: './new-employee.html',
  styleUrl: './new-employee.css'
})
export class NewEmployee implements OnInit {

  departments: Department[] = [];
  employee: Employee = new Employee();
  responseDTO: ResponseDTO = new ResponseDTO();
  isVisible: boolean = false;
  validationErrors: { [key: string]: string } = {};

  states: string[] = ['Andhra Pradesh', 'Arunachal Pradesh', 'Assam', 'Bihar', 'Chhattisgarh', 'Goa', 'Gujarat', 'Haryana', 'Himachal Pradesh', 'Jharkhand', 'Karnataka', 'Kerala', 'Madhya Pradesh', 'Maharashtra', 'Manipur', 'Meghalaya', 'Mizoram', 'Nagaland', 'Odisha', 'Punjab', 'Rajasthan', 'Sikkim', 'Tamil Nadu', 'Telangana', 'Tripura', 'Uttar Pradesh', 'Uttarakhand', 'West Bengal'];

  constructor(private router: Router, private departmentCrud: DepartmentCrud, private employeeCrud: EmployeeCrud) {
  }


  hasValidationError(field: string) : boolean {
    return field in this.validationErrors;
  }

  getValidationErrorMessage(field : string) : string {
    return this.validationErrors[field];
  }

  ngOnInit(): void {
    this.loadAllDepartments();
  }

  backToHome() {
    this.router.navigate(['employees']);
  }




  addNewEmployee() {
    console.log(this.employee);
    this.employeeCrud.addNewEmployee(this.employee).subscribe({
      next: (response) => {
        this.responseDTO = response;
        console.log(this.responseDTO);
        this.isVisible = true;
      },
      error: (err) => {
        this.validationErrors = err.error;
        console.log("Exception while calling add new employee API");
      },
      complete: () => {
        console.log("New employee added successfully!!");
      }
    });
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

