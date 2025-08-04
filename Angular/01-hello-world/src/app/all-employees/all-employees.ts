import { Component } from '@angular/core';
import { Employee } from '../employee';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-all-employees',
  imports: [CommonModule],
  templateUrl: './all-employees.html',
  styleUrl: './all-employees.css'
})
export class AllEmployees {
  
  sadhan: Employee = new Employee(101, 'Sadhan', 90000);
  selva: Employee = new Employee(102, 'Selva', 90000);
  srivishwa: Employee = new Employee(103, 'srivishwa', 90000);
  guna: Employee = new Employee(104, 'Guna', 90000);
  ajay: Employee = new Employee(105, 'Ajay', 90000);

  employees: Employee[] = [this.sadhan, this.selva, this.ajay, this.srivishwa, this.guna];


}
