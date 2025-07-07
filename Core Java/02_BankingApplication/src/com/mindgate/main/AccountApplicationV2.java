package com.mindgate.main;

import com.mindgate.main.domain.Account;

public class AccountApplicationV2 {
	public static void main(String[] args) {
		Account account = null;
		System.out.println(account);
		account = new Account(101, "Test", 1000);
		//System.out.println(account);
		
		String txt = "Hello";
		System.out.println(txt);
		System.out.println(account);
	}
}
