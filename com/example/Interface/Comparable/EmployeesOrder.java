package com.example.Interface.Comparable;

import java.util.Arrays;

public class EmployeesOrder {

	public static void main(String[] args) {
		Employee[] employee= {new Employee(1000.0,"b"), new Employee(200.0,"a")};
		Arrays.sort(employee);
		for(Employee e:employee)
			System.out.println(e);
	}
}
class Employee implements Comparable<Object>{
	int id;
	String name;
	double salary;		
	private static int idNumber=1000;
	Employee(double salary, String name){
		this.salary=salary;
		this.name=name;
		id=idNumber++;
	}
	public String toString() {
		return "Employee name="+name+" ,salary="+salary+" ,id="+id;
	}
	@Override
	public int compareTo(Object object){
		Employee e=(Employee)object;
		return name.compareTo(e.name); //natural ordering
	}	
}