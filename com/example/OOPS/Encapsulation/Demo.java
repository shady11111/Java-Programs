package com.example.OOPS.Encapsulation;

public class Demo {

	public static void main(String[] args) {
		Employee e=new Employee();
		//e.age=-20;	//cannot be accessed as age is private
		e.setAge(19);
		e.setAge(5);
	}

}
class Employee{
	private int age;
	void setAge(int age) {
		if(age>=18 && age<=60) {
			this.age=age;
			System.out.println("Age is "+this.age);
		}
		else
			System.out.println("Invalid age");
	}
}
