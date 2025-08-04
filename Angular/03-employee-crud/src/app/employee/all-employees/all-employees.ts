import { Component } from '@angular/core';
import { Employee } from '../domain/employee';
import { EmployeeCrud } from '../services/employee-crud';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-all-employees',
  imports: [CommonModule],
  templateUrl: './all-employees.html',
  styleUrl: './all-employees.css'
})
export class AllEmployees {
  employees: Employee[] = [];
  status: boolean = false;

  constructor(private router: Router, private employeeCrud: EmployeeCrud) {

  }

  ngOnInit(): void {
    this.loadAllEmployees();
  }

  getEmployeeDetails(employeeId: string) {
    this.router.navigate(['details',employeeId]);
  }

  updateEmployee(employeeId: string) {
    this.router.navigate(['update',employeeId]);
  }

  deleteEmployee(employeeId: string) {
    this.employeeCrud.deleteEmployee(employeeId).subscribe({
      next: (response) => {
        this.status = response;
        console.log(this.status);
        this.loadAllEmployees();
      },
        error: (err) => {
        console.log("Exception while calling API!");
      },
      complete: () => {
        console.log("API call completed successfully!");
      }
    
    });
  }

  loadAllEmployees() {
    this.employeeCrud.getAllEmployees().subscribe({
      next: (response) => {
        this.employees = response;
        console.log(this.employees);
      },
      error: (err) => {
        console.log("Exception while calling API!");
      },
      complete: () => {
        console.log("API call completed successfully!");
      }
    });
  }

}
