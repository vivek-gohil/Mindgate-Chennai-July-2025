package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.main.domain.Savigns;

public class AccountApplcationV4 {
	public static void main(String[] args) {
		int accountNumber;
		String name;
		double balance;
		boolean isSalary;
		int choice;
		String continueChoice = "";
		double amount;

		// Account account = new Account();
		Savigns savings = null;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter account number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter name");
		name = scanner.nextLine();
		System.out.println("Enter balance");
		balance = scanner.nextDouble();
		System.out.println("Do you want to open salary account true/false");
		isSalary = scanner.nextBoolean();

		savings = new Savigns(accountNumber, name, balance, isSalary);
		System.out.println("Savings Account Created !!");
//		System.out.println("Account Number = " + account.getAccountNumber() + " Name = " + account.getName()
//				+ " Balance = " + account.getBalance());

		System.out.println(savings);

		do {
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter amount to withdraw");
				amount = scanner.nextDouble();
				boolean result = savings.withdraw(amount);
				if (result)
					System.out.println("Withdraw successfull");
				else
					System.out.println("Withdraw Failed");
				break;
			case 2:
				System.out.println("Enter amount to deposit");
				amount = scanner.nextDouble();
				result = savings.deposit(amount);
				if (result)
					System.out.println("Deposit successfull");
				else
					System.out.println("Deposit Failed");
				break;
			case 3:
				System.out.println("Balance =  " + savings.getBalance());
				break;
			case 4:
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			if (choice > 0 && choice < 4) {
				System.out.println("Do you want to continue");
				continueChoice = scanner.next();
			}
		} while (continueChoice.equals("Yes"));

	}

}
