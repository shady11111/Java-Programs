package com.example.Collection.Set.HashSet;

public class Runner2 {
	public static void main(String[] args) {
		Student student1=new Student("A", 85);
		Student student2=new Student("D", 83);
		Student student3=new Student("C", 60);
		Student student4=new Student("B", 95);
		
		HashSet hashSet=new HashSet();
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);
		
		System.out.println("Size:"+hashSet.size());
		hashSet.display();
	}
}
class Student{
	String name;
	int marks;
	public Student(String n, int m) {
		name=n;
		marks=m;
	}
	@Override
	public int hashCode() {
		return marks;
	}
	@Override
	public boolean equals(Object argument) {
		if(!(argument instanceof Student))return false;
		Student student=(Student)argument;
		return name.equals(student.name)&&marks==student.marks;
	}
	public String toString() {
		return "Student[name="+name+", marks="+marks+"]";
	}
}