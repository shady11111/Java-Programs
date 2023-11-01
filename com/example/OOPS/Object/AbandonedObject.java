package com.example.OOPS.Object;

public class AbandonedObject {

	public static void main(String[] args) {
		Student.defaultValueForName();
		Student s1 = new Student("A");
		System.out.println(s1+" is the address of the object, which s1 is referring to.");
		s1.display();
		s1 = null;
		System.out.println("To "+s1+" object s1 refers to now");
		// s1.display(); //during runtime JVM throws NullPointerException, but no
		// compilation error is thrown, as it's non static
		// s1.defaultValueForName();//static method can be called, with reference
		// pointing to null
		Student.defaultValueForName();
		System.out.println(new Student("B")+" is the address of this abandoned object");// new object's memory location, hashcode
	}
}

class Student {
	String name;
	static boolean studentsJoined = false;

	public Student(String name) {
		studentsJoined = true;
		this.name=name;
	}

	void display() {
		System.out.println(name + " is the name.");
	}

	static void defaultValueForName() {
		if (!studentsJoined)
			System.out.println("No student has joined yet.");
	}
}