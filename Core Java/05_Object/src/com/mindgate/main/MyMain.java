package com.mindgate.main;

import com.mindgate.main.domain.Employee;

public class MyMain {
	public static void main(String[] args) {
		
		String message = new String("Hi");
		String txt = new String("Hi");

		System.out.println(message.equals(txt)); // true
		
		System.out.println(message.hashCode());
		System.out.println(txt.hashCode());
		
		
		System.out.println();
		
		Employee e1 = new Employee(101, "Test", 1000);
		Employee e2 = new Employee(101, "Test", 1000);
		
		System.out.println(e1.equals(e2)); // true
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		
		
		
	}
}
