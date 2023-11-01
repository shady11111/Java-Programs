package com.example.Object;

public class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString(){
		return "Student's name: "+name+" and age: "+age;
	}
}