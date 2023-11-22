package com.example.Interface.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
	public static void main(String[] args) {
		Employee[] employeeArray= {new Employee(100.0,"a"), new Employee(200.0,"b")};
		Arrays.sort(employeeArray, new A());
		Arrays.sort(employeeArray, new B());
		for(Employee employee:employeeArray)
			System.out.println(employee);
	}
}
class A implements Comparator<Object>{
	public int compare(Object object1, Object object2) {
		Employee employee1=(Employee)object1;
		Employee employee2=(Employee)object2;
		
		if(employee1.salary>employee2.salary)return 1;
		else if(employee1.salary<employee2.salary)return -1;
		else return 0;
		
//		return (int) (((Employee)object1).salary-((Employee)object2).salary);
	}
}
class B implements Comparator<Object>{
	public int compare(Object object1, Object object2) {
		return ((Employee)object1).id-((Employee)object2).id;
	}
}
//class Arrays{
//	public static void sort(Object[] array, Comparator<Object> c) {
//		for(int i=0;i<array.length-1;i++)
//			for(int j=0;j<array.length-1-i;j++)
//				if(c.compare(array[j], array[j+1])>0)
//					sort method;
//	}
//}
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