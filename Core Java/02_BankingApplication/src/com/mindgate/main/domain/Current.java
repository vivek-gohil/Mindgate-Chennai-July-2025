package com.mindgate.main.domain;

public class Current extends Account {
	private double overdraftBalance;
	private double initialOverdraftBalance;

	public Current() {
		// TODO Auto-generated constructor stub
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		initialOverdraftBalance = overdraftBalance;
	}

	@Override
	public boolean withdraw(double amount) {

		if (amount > 0 && amount <= getBalance()) {
			setBalance(getBalance() - amount);
			return true;
		}

		if (amount > 0 && amount <= getBalance() + overdraftBalance) {
			amount = amount - getBalance();
			setBalance(0);
			overdraftBalance -= amount;
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (initialOverdraftBalance > overdraftBalance) {
			if (amount > (initialOverdraftBalance - overdraftBalance)) {
				amount = amount - (initialOverdraftBalance - overdraftBalance);
				overdraftBalance = initialOverdraftBalance;
				setBalance(getBalance() + amount);
				return true;
			} else {
				overdraftBalance += amount;
				return true;
			}
		} else {
			if (amount > 0) {
				setBalance(getBalance() + amount);
				return true;
			}
		}
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", getAccountNumber()=" + getAccountNumber()
				+ ", getName()=" + getName() + ", getBalance()=" + getBalance() + "]";
	}

}
