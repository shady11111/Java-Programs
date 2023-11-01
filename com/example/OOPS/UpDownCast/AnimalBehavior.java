package com.example.OOPS.UpDownCast;

public class AnimalBehavior {

	public static void main(String[] args) {
		Animal a=new Dog();
		a.move();
//		a.play(); //can only access overridden method
		
		Dog d=(Dog)a;
		d.play();
		
		((Dog)a).play();	
		
		Animal a1=new Animal();
//		a1.play(); //cannot access subclass only belonging methods
		a1.move();
//		Dog d1=(Dog)a1; //ClassCastException(runtime) //no compilation error
//being a reference type of subclass, would like to have access to all methods of subclass,
//this is not possible with subtype referring to supertype instance
//		d1.move();
//		d1.play();
	}
}
class Animal{
	void move() {
		System.out.println("Animal moves");
	}
}
class Dog extends Animal{
	void play() {
		System.out.println("Dog plays");
	}
	void move() {
		System.out.println("Dog moves");
	}
}