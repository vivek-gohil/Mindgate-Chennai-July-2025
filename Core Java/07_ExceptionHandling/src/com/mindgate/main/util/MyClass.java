package com.mindgate.main.util;

public class MyClass {
	static {
		System.out.println("MyClass is loaded into JVM");
	}

	{
		System.out.println("MyClass object created");
	}

	public MyClass() {
		System.out.println("MyClass object created :: Constructor Called");
	}
}
