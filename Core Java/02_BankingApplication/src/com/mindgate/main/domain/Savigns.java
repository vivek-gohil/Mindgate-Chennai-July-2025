package com.mindgate.main.domain;

public class Savigns extends Account {
	private final double MINIMUM_BALANCE = 500;
	private boolean isSalary;

	public Savigns() {
		System.out.println("Default constructor of Savings");
	}

	public Savigns(int accountNumber, String name, double balance, boolean isSalary) {
		super(accountNumber, name, balance);
		this.isSalary = isSalary;
		System.out.println("Overloaded constructor of Savings");
	}

	@Override
	public boolean withdraw(double amount) {
		if (isSalary) {
			return super.withdraw(amount);
		}
		if (!isSalary && getBalance() - amount >= MINIMUM_BALANCE) {
			return super.withdraw(amount);
		}
		return false;
	}
//
//	@Override
//	public boolean withdraw(double amount) {
//		if (isSalary && amount > 0 && getBalance() >= amount) {
//			setBalance(getBalance() - amount);
//			return true;
//		}
//		if (isSalary == false && amount > 0 && getBalance() - amount >= MINIMUM_BALANCE) {
//			setBalance(getBalance() - amount);
//			return true;
//		}
//		return false;
//	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	public double getMINIMUM_BALANCE() {
		return MINIMUM_BALANCE;
	}

	@Override
	public String toString() {
		return "Savigns [MINIMUM_BALANCE=" + MINIMUM_BALANCE + ", isSalary=" + isSalary + ", getAccountNumber()="
				+ getAccountNumber() + ", getName()=" + getName() + ", getBalance()=" + getBalance() + "]";
	}

	
}
