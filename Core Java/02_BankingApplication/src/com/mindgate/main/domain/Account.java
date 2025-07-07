package com.mindgate.main.domain;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;

	// Default constructor
	public Account() {
		System.out.println("Default constructor of Account");
	}

	// Overloaded constructor - 3 Param
	public Account(int accountNumber, String name, double balance) {
		System.out.println("Overloaded constructor of Account - 3 params");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}
		return false;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

}
