package com.mindgate.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.util.SortEmployeeByName;

public class CollectionsMain {

	public static void main(String[] args) {
		System.out.println("5. TreeMap");
		Employee employee1 = new Employee(104, "Manikandan", 90090);
		Employee employee2 = new Employee(101, "Bala", 90000);
		Employee employee3 = new Employee(103, "Abhinash", 90300);
		Employee employee4 = new Employee(105, "Kavithalaya", 90200);
		Employee employee5 = new Employee(102, "Mithra", 80900);
		SortedMap<Integer, Employee> employeeSortedMap = new TreeMap<>();

		employeeSortedMap.put(employee1.getEmployeeId(), employee1);
		employeeSortedMap.put(employee2.getEmployeeId(), employee2);
		employeeSortedMap.put(employee3.getEmployeeId(), employee3);
		employeeSortedMap.put(employee4.getEmployeeId(), employee4);
		employeeSortedMap.put(employee5.getEmployeeId(), employee5);

		Set<Integer> employeeSortedKeys = employeeSortedMap.keySet();
		for (Integer key : employeeSortedKeys) {
			System.out.println("" + key + " = " + employeeSortedMap.get(key));
		}

		System.out.println("---------------------------------");
		System.out.println("4. HashMap");
		Map<Integer, Employee> employeeMap = new HashMap<>();
		employeeMap.put(employee1.getEmployeeId(), employee1);
		employeeMap.put(employee2.getEmployeeId(), employee2);
		employeeMap.put(employee3.getEmployeeId(), employee3);
		employeeMap.put(employee4.getEmployeeId(), employee4);
		employeeMap.put(employee5.getEmployeeId(), employee5);

		Set<Integer> employeeKeys = employeeMap.keySet();
		for (Integer key : employeeKeys) {
			System.out.println("" + key + " = " + employeeMap.get(key));
		}

		System.out.println("-".repeat(80));

		System.out.println("3. TreeSet");

		// Default - ByEmployeeId
		// SortedSet<Employee> employeeTreeSet = new TreeSet<>();
		SortedSet<Employee> employeeTreeSet = new TreeSet<>(new SortEmployeeByName());
		employeeTreeSet.add(employee1);
		employeeTreeSet.add(employee2);
		employeeTreeSet.add(employee3);
		employeeTreeSet.add(employee4);
		employeeTreeSet.add(employee5);

		for (Employee employee : employeeTreeSet) {
			System.out.println(employee);
		}
		System.out.println("-".repeat(80));

		System.out.println("2. HashSet");
		Set<Integer> idSet = new HashSet<>();
		idSet.add(89);
		idSet.add(51);
		idSet.add(86);
		idSet.add(29);
		idSet.add(73);
		idSet.add(89);
		idSet.add(51);
		idSet.add(86);

		System.out.println(idSet);
		System.out.println("-".repeat(80));
		System.out.println(idSet.remove(89));
		System.out.println("after remove");
		System.out.println(idSet);
		System.out.println("-".repeat(80));
		System.out.println("HashSet with employee objects");

//		Employee employee1 = new Employee(104, "Manikandan", 90090);
//		Employee employee2 = new Employee(101, "Bala", 90000);
//		Employee employee3 = new Employee(103, "Abhinash", 90300);
//		Employee employee4 = new Employee(105, "Kavithalaya", 90200);
//		Employee employee5 = new Employee(102, "Mithra", 80900);
		Employee employee6 = new Employee(104, "Manikandan", 90090);
		Employee employee7 = new Employee(101, "Bala", 90000);
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
		System.out.println(employee4.hashCode());
		System.out.println(employee5.hashCode());
		System.out.println(employee6.hashCode());
		System.out.println(employee7.hashCode());

		Set<Employee> employeeSet = new HashSet<>();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		employeeSet.add(employee4);
		employeeSet.add(employee5);
		employeeSet.add(employee6);
		employeeSet.add(employee7);

		System.out.println(employeeSet.size());
		for (Employee employee : employeeSet) {
			System.out.println(employee);
		}

		System.out.println("-".repeat(80));

		System.out.println("1. ArrayList");
		List<String> nameList = new ArrayList<>();
		System.out.println("Size = " + nameList.size());
		nameList.add("Mohan");
		nameList.add("Senoj");
		nameList.add("Ajay");
		nameList.add("Senoj");
		nameList.add("Devak");
		nameList.add("Mohan");
		System.out.println("Size = " + nameList.size());
		System.out.println(nameList.toString());
		System.out.println(nameList.remove("Senoj"));
		System.out.println("After delete");
		System.out.println("Size = " + nameList.size());
		System.out.println(nameList.toString());
		System.out.println(nameList.get(1));

		System.out.println("-".repeat(80));

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee2);
		employeeList.add(employee5);
		employeeList.add(employee1);

		System.out.println("Size :: " + employeeList.size());
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

		System.out.println("-".repeat(80));

		System.out.println(employeeList.remove(employee1));
		System.out.println("After delete");
		System.out.println("Size :: " + employeeList.size());
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

	}

}
