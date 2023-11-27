package com.example.FileHandling;

import java.io.Serializable;

@SuppressWarnings("serial")
class Student implements Serializable{
	String name;
	int age;
	Student(int age, String name){
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return "Student's name is "+name+" and age is "+age;
	}
}