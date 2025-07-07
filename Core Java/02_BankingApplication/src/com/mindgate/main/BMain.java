package com.mindgate.main;

class A {
	public A() {
		System.out.println("Hi");
	}

	public A(int x) {
		System.out.println("Hi " + x);
	}

}

class B extends A {
	public B() {
		System.out.println("Hello");
	}

	public B(int x) {
		super(x);
		System.out.println("Hello " + x);
	}

}

public class BMain {

	public static void main(String[] args) {
		B b = new B(10);
	}

}
