package com.question;

import java.util.ArrayList;
import java.util.Iterator;

class Employee {
	private int empId;
	private String empName;

	Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	int getId() {
		return empId;
	}

	String getName() {
		return empName;
	}
}

class ArrayListPrivate {
	private ArrayList<Employee> list = new ArrayList<Employee>();

	ArrayList<Employee> get() {
		return list;
	}
}

class EmployeeExampleMain {
	public static void main(String[] args) {
		ArrayListPrivate alp = new ArrayListPrivate();
		alp.get().add(new Employee(12, "rajesh"));
		alp.get().add(new Employee(15, "dheeraj"));
		alp.get().add(new Employee(20, "choudhary"));
		Iterator itr = alp.get().iterator();
		while (itr.hasNext()) {
			Employee e = (Employee) itr.next();
			System.out.println("Employee id is: " + e.getId() + " Name: " + e.getName());
		}
	}
}