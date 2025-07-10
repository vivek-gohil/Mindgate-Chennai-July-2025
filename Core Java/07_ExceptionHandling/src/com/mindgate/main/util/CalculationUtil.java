package com.mindgate.main.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationUtil {
	private double numberOne;
	private double numberTwo;
	private double result;

	public void accept() {
		System.out.println("accept() start");
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter number1");
			numberOne = scanner.nextDouble();
			System.out.println("Enter number2");
			numberTwo = scanner.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid Input Format");
		} finally {
			System.out.println("finally start()");
			scanner.close();
			System.out.println("finally end()");
		}
		System.out.println("accept() end");
	}

	public void calculate() {
		System.out.println("calculate() start");
		result = numberOne + numberTwo;
		System.out.println("calculate() end");
	}

	public void display() {
		System.out.println("display() start");
		System.out.println("Result = " + result);
		System.out.println("display() end");
	}
}
