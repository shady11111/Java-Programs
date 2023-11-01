package com.example.OOPS.Constructor;

import java.util.ArrayList;
import java.util.List;

public class Organisation {

	public static void main(String[] args) {
		Department culinary=new Department("Culinary");
		Department security=new Department("Security");
		culinary.enrollEmployee("A");
		culinary.enrollEmployee("B");
		security.enrollEmployee("A");
		security.enrollEmployee("B");
		culinary.displayEmployees();
		security.displayEmployees();
	}

}

class Employee{
	String name;
	int ID;
	Employee(String name, int ID){
		this.name =name;
		this.ID=ID;
	}
}
class Department{
	String name;
	List<Employee> employees=new ArrayList<Employee>();
	int employeeCounter = 0;
	
	Department(String name) {
		this.name =name;
	}
	
	void enrollEmployee(String name) {
		++employeeCounter;
		Employee employee=new Employee(name, employeeCounter);
		employees.add(employee);
	}
	
	void displayEmployees() {
        System.out.println("Employees in the " + name + " department:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.name + ", ID: " + employee.ID);
        }
    }
}