package com.mindgate.main;

import com.mindgate.main.domain.Current;

public class AccountApplicationV4 {
	public static void main(String[] args) {
		Current current = new Current(101, "Mindgate", 10000, 50000);

		System.out.println(current);
		System.out.println("withdraw = 5000");
		boolean result = current.withdraw(5000);
		System.out.println(result); // true
		System.out.println(current.getBalance()); // 5000
		System.out.println(current.getOverdraftBalance()); // 50000

		System.out.println();

		System.out.println("withdraw = 10000");
		result = current.withdraw(10000);
		System.out.println(result); // true
		System.out.println(current.getBalance()); // 0
		System.out.println(current.getOverdraftBalance()); // 45000

		System.out.println();

		System.out.println("withdraw = 20000");
		result = current.withdraw(20000);
		System.out.println(result); // true
		System.out.println(current.getBalance()); // 0
		System.out.println(current.getOverdraftBalance()); // 25000

		System.out.println();

		System.out.println("deposit = 10000");
		result = current.deposit(10000);
		System.out.println(result); // true
		System.out.println(current.getBalance()); // 0
		System.out.println(current.getOverdraftBalance()); // 35000

		System.out.println();

		System.out.println("deposit = 25000");
		result = current.deposit(25000);
		System.out.println(result); // true
		System.out.println(current.getBalance()); // 10000
		System.out.println(current.getOverdraftBalance()); // 50000

		System.out.println("deposit = 5000");
		result = current.deposit(5000);
		System.out.println(result); // true
		System.out.println(current.getBalance()); // 15000
		System.out.println(current.getOverdraftBalance()); // 50000

	}
}
