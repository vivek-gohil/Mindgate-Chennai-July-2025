import { Component } from '@angular/core';
import { Employee } from '../employee';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-new-employee',
  imports: [FormsModule],
  templateUrl: './new-employee.html',
  styleUrl: './new-employee.css'
})
export class NewEmployee {
  employee: Employee = new Employee(0,'',0.0);

  display() {
    console.log(this.employee);
  }

}
