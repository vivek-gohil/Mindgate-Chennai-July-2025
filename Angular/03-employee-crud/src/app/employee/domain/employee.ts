import { Department } from "./department";

export class Employee {
    employeeId: string = '';
    name: string = '';
    salary: number = 0.0;
    dateOfBirth: Date = new Date();
    departmentDTO: Department = new Department();
    gender: string = '';
    state: string = '';
    emailId: string = '';
}