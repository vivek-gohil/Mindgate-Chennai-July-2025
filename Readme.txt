https://github.com/vivek-gohil/Mindgate-Chennai-July-2025

New Project : 01_BankingApplication

New Class : Account - com.mindgate.main.domain
	accountNumber
	name
	balance

	public boolean withdraw(double amount)
	public boolean deposit(double amount)

	getters and setters
New Class : AccountMainV3 - com.mindgate.main
	Accept accountNumber,name,balance from user.
	Print account details

	Menu
	1. Withdraw
	2. Deposit
	3. Check Balance
	4. Exit
	Enter your choice
	....

	Do you want to continue yes-no?
	yes - print the menu again and do the transaction


Constructor
	Same name as of class
	Invoke automatically, on object creation
	No return type


Employee.java -> javac Employee.java -> Employee.class

Nano is a Car
Manager is a Employee
Savings is a Account


class Demo {
	public void display() {
		//1000 lines code
	}
}
class MyClass extends Demo {
	public void display() {
		if(condition) 
			super() 
		else 
			//code
	}
}

class MyClass {
	public void show() {
		Demo demo = new Demo();
		demo.display()		
	}
}




is a
Account
	withdraw()
	deposit()
Savings extends Account
	withdraw()
	deposit()
Current extends Account 
	withdraw()
	deposit()
FixedDeposit
	withdraw()
	deposit()





A {
	A() {	Hi }
	A(int x) { Hi x }
}
B extends A {
	B() { Hello }
	B(int x) { super(x); Hello x; }
}
BMain {
	main() {
		//B b = new B(); Hi Hello
		B b = new B(10); Hi Hello 10 , Hi 10 Hello 10
	}
}
User can send multiple types of messages like
	Email Message
	SMS Message	
	WhatsApp Message
Use Polymorphism and help user to choose and send message.
	
Create new class as Employee with employeeId,name,salary variables.
	1.Add only parameterized constructor - 2 param (name,salary)
	2.Generate employeeId as 10001,10002,10003
	3.Override toString method
	4. main
		Employee employee1 = new Employee("Seema",1000);
		Employee employee2 = new Employee("Reema",1000);
		Employee employee3 = new Employee("Meena",1000);
		Employee employee4 = new Employee("Teena",1000);

		Sysout()
		Sysout(employee1); //1001 Seema 1000
		Sysout(employee2); //1002 Reema 1000
		Sysout(employee3); //1003 Meena 1000
		Sysout(employee4); //1004 Teena 1000


















	
