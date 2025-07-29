package com.mindgate.main.processor;

import org.springframework.batch.item.ItemProcessor;

import com.mindgate.main.domain.Customer;

public class CustomerItemProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		customer.setFirstName(customer.getFirstName().toUpperCase());
		customer.setLastName(customer.getLastName().toUpperCase());
		return customer;
	}

}
