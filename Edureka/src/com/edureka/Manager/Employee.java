package com.edureka.Manager;

public class Employee extends Manager {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.salary = 10000;
		System.out.println("Employee Salary is " + employee.salary);
		
		Manager manager = new Manager();
		manager.salary = 100000;
		System.out.println("Manager Salary is " + manager.salary);

	}

}
