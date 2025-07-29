package com.mindgate.main.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.service.EmployeeService;

@Controller
public class EmployeeCRUDController {

	private EmployeeService employeeService;

	public EmployeeCRUDController(EmployeeService employeeService) {
		System.out.println("Overloaded Constructor of EmployeeCRUDController");
		this.employeeService = employeeService;
	}

	@RequestMapping("saveemployeetodb")
	public String addEmployeeToDB(Employee employee) {
		System.out.println("in addEmployeeToDB()");
		System.out.println(employee);
		employeeService.addNewEmployee(employee);
		return "redirect:/";
	}

	@RequestMapping("newemployee")
	public ModelAndView showAddNewEmployeePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addnewemployee");
		modelAndView.addObject("employee", new Employee());
		return modelAndView;
	}

	@RequestMapping("/")
	public ModelAndView printAllEmployees() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("index");

		List<Employee> employeeList = employeeService.getAllEmployees();
		System.out.println(employeeList);
		modelAndView.addObject("employees", employeeList);

		return modelAndView;
	}

}
