package com.example.OOPS.Encapsulation;

public class Demo2 {
	public static void main(String[] args) {
		Student s1=Student.newStudentInstance();
		s1.setName("Z");
		s1.display();//name:Z age:21 ID:1500
		Student s2=Student.newStudentInstance();
		s2.display();//name:null age:21 ID:1500
		s1.display();//name:Z age:21 ID:1500
		Student s3=new Student(s2.getAge());
		s3.display();//name:null age:21 ID:0
	}
}
class Student{
	private String name;
	private int age;
	private long ID;
	
	private Student(int age, String name, long ID){
		this.age=age;
		this.name=name;
		this.ID=ID;
	}
	Student(int age){
		this.age=age;
	}
	public static Student newStudentInstance() {
		return new Student(21, null, 1500);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	void display() {
		System.out.println("name:"+this.name+" age:"+this.age+" ID:"+ID);
	}
}
	


