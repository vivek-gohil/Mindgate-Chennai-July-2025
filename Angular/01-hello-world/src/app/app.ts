import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { First } from "./first/first";
import { Second } from "./second/second";
import { CommonModule } from '@angular/common';
import { AllEmployees } from './all-employees/all-employees';
import { NewEmployee } from './new-employee/new-employee';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, First, Second , CommonModule , AllEmployees , NewEmployee],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {

  name: string = "Sadhan";
  isFirstVisible: boolean = false;
  isSecondVisible: boolean = false;

  displayFirst() {
    this.isFirstVisible = !this.isFirstVisible;
  }

  displaySecond() {
    this.isSecondVisible = !this.isSecondVisible;
  }
}
