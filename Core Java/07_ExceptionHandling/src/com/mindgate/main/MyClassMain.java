package com.mindgate.main;

public class MyClassMain {
	public static void main(String[] args) {
		System.out.println("main() start");

		try {
			Class.forName("com.mindgate.main.util.MyClasss");
		} catch (ClassNotFoundException e) {
			System.out.println("Invalid Class Name");
			System.out.println(e.getMessage());
		}

		System.out.println("main() end");
	}

}
