import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeCrud } from '../services/employee-crud';
import { Employee } from '../domain/employee';

@Component({
  selector: 'app-employee-details',
  imports: [],
  templateUrl: './employee-details.html',
  styleUrl: './employee-details.css'
})
export class EmployeeDetails implements OnInit {
  employeeId: string = '';
  employee: Employee = new Employee();

  constructor(private router: Router,private employeeCrud: EmployeeCrud, private activatedRoute: ActivatedRoute) {

  }
  ngOnInit(): void {
    this.employeeId = this.activatedRoute.snapshot.params['employeeId'];
    console.log(this.employeeId);
    this.getEmployee(this.employeeId);

  }
  backToHome() {
    this.router.navigate(['employees']);
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


}
