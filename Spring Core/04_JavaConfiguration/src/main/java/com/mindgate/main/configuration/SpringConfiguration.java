package com.mindgate.main.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mindgate.main.repository.EmployeeRepository;
import com.mindgate.main.service.EmployeeService;

@Configuration
public class SpringConfiguration {

	// @Bean(name="employeeRepository")
	@Bean
	public EmployeeRepository getEmployeeRepository() {
		return new EmployeeRepository();
	}

	// @Bean(name="employeeService")
	@Bean
	public EmployeeService getEmployeeService() {
		return new EmployeeService(getEmployeeRepository());
	}
}
