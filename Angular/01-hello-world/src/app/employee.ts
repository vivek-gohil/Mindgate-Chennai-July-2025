export class Employee {
    employeeId: number = 0;
    name: string = "";
    salary: number = 0.0;

    constructor(employeeId: number, name: string, salary: number) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
}