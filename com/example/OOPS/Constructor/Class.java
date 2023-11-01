package com.example.OOPS.Constructor;

public class Class {

	public static void main(String[] args) {
		Student s1 = new Student("A");
		s1.display();
	}

}

class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

	void display() {
		System.out.println("Student's name is " + name);
	}
}
