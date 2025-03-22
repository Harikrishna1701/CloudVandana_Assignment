package com.cloudvandana.www;

import java.util.*;

class Employee{
	
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void displayDetails() {
		System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
	}
}

public class EmployeeManagement{
	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>(Arrays.asList(
				new Employee(101, "Hari", 55000),
				new Employee(102, "Suresh", 60000),
	            new Employee(103, "Mahesh", 65000),
	            new Employee(104, "Rajesh", 70000),
	            new Employee(105, "Venkatesh", 75000)
    ));
		employees.forEach(Employee::displayDetails);
	}
}