package com.example.Strings;

public class Demo {

	public static void main(String[] args) {
		System.out.println((new Student("ABC",21)));
		Student s=new Student("XYZ",20);
		System.out.println(s);
		System.out.println(s.toString());
	}
}