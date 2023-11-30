package com.example.Interface.Comparable;

import java.util.Comparator;

public class Student implements Comparable<Object>, Comparator<Object>{
	int age;
	int ID;
	String name;
	static int number=1000;
	
	Student(int age, String name){
		this.name=name;
		this.age=age;
		ID=number++;
	}
	
	public String toString() {
		return "Student's name="+name+", age="+age+", id="+ID;
	}
//natural ordering	
	public int compareTo(Object o) {
		Student s=(Student)o;
		return name.compareTo(s.name);
	}
	
	public int compare(Object o1, Object o2) {
		return ((Student)o1).ID - ((Student)o2).ID;
	}
//	public int compare(Object o1, Object o2) {
//		return ((Student)o1).age - ((Student)o2).age;
//	}
}