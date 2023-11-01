package com.example.OOPS.Inheritance;

public class Demo3 {

	public static void main(String[] args) {
		Doctor d=new Doctor("A","Neurology");
		System.out.println("Doctor "+d.name+", is specialized in "+d.specialization);
	}

}
class Person{
	String name;
	Person(String name){
		this.name=name;
	}
}
class Doctor extends Person{
	String specialization;
	Doctor(String name, String specialization){
		super(name);
		this.specialization=specialization;
	}
}
