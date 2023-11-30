package com.example.Interface.Comparable;

import java.util.Arrays;

public class StudentDemo {

	public static void main(String[] args) {
		Student[] students= {new Student(21,"B") ,new Student(23,"A"), new Student(20,"D"), new Student(22,"C")};
		Arrays.sort(students);
		for(Student student:students) {
			System.out.println(student);
		}
		
		System.out.println();
		
		Arrays.sort(students, new StudentAgeSort());
		for(Student student:students) {
			System.out.println(student);
		}
		
		System.out.println();
		
		Arrays.sort(students, new StudentIDSort());
		for(Student student:students) {
			System.out.println(student);
		}
	}
}