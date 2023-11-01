package com.example.OOPS.Polymorphism;

public class Demo3 {

	public static void main(String[] args) {
		Demo3 d=new Demo3();
		d.m1(3);
		d.m1(new Animal());
		d.m1(null);	//calls the more specific one, if a method with parameter cat would be there too, then confusion is created
// When you call d.m1(null);, it calls the m1(Dog d) method because the parameter null is treated as a reference of type Dog,
//which is a more specific type than Animal.
//If m1(Cat c) method is uncommented, compilation error occurs because it would introduce ambiguity due to multiple matching methods.
	}
	void m1(Animal a) {
		System.out.println("Animal");
	}
	void m1(Dog d) {
		System.out.println("Dog");
	}
//null is not compatible with primitive types in Java. It can only be used with reference types.
//When you try to assign or use null with a primitive type, you will encounter a compilation error.
	void m1(int n) {
		System.out.println("primitive type");
	}
//	void m1(Cat c) {
//		System.out.println("Cat");
//	}
}
class Cat extends Animal{
	
}
class Dog extends Animal{
	
}
class Animal{
	
}