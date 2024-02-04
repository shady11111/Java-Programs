package com.example.OOPS.Encapsulation;

public class Demo3 {

	public static void main(String[] args) {
		Human h1=new Human();
		h1.setName("A");
//		h1.setAge(11,h1);
		h1.setAge(11);
		System.out.println(h1.getName()+" : "+h1.getAge());//A : 11
	}
}
class Human{
	private int age;
	private String name;
	
	int getAge() {
		return age;
	}	
	String getName() {
		return name;
	}

//	void setAge(int age, Human h) {
//		Human object=h;
//		object.age=age;
//	}

//Instead of passing the current object as an argument, this keyword can be used
	void setAge(int age) {
		this.age=age;
	}
	void setName(String name) {
		this.name=name;
	}	
}
