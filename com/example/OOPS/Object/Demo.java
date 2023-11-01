package com.example.OOPS.Object;

public class Demo {

	public static void main(String[] args) {
		Laptop object1=new Laptop();
		object1.model="Mac Pro";
		object1.price=100;
		System.out.println(object1);
//		System.out.println(object.toString());
//Implicitly toString() method gets called
		
		Laptop object2=new Laptop();
		object2.model="Mac Pro";
		object2.price=100;
		System.out.println(object2);
		
		boolean result= object1==object2;
		System.out.println(result);
		
		result=object1.equals(object2);
		System.out.println(result);
		
	}

}
class Laptop{
	String model;
	int price;
	
	public String toString() {
		return model+" : "+price;
	}
	public boolean equals(Laptop that) {
		return this.model==that.model && this.price==that.price;
	}
}
