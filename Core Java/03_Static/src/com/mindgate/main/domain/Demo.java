package com.mindgate.main.domain;

public class Demo {
	private static int num1 = 10;
	private static int num2 = 10;

	public static void display() {
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		num1 = num1 + 10;
		num2 = num2 + 10;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
	
}
