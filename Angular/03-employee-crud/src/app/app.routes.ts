import { Routes } from '@angular/router';
import { AllEmployees } from './employee/all-employees/all-employees';
import { NewEmployee } from './employee/new-employee/new-employee';
import { EmployeeDetails } from './employee/employee-details/employee-details';
import { UpdateEmployee } from './employee/update-employee/update-employee';

export const routes: Routes = [
    { path: '', redirectTo: 'employees', pathMatch: 'full' },
    { path: 'employees', component: AllEmployees },
    { path: 'addnew', component: NewEmployee },
    { path: 'details/:employeeId', component: EmployeeDetails },
    { path: 'update/:employeeId', component: UpdateEmployee }

];