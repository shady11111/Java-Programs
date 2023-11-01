package com.example.OOPS.Abstract;

public class Demo {

	public static void main(String[] args) {
//		Vehicle v=new Vehicle(); //abstract class objects cannot be created
		Vehicle v=new RangeRover();
		v.drive();
		v.applyBrake();
//		((Car)v).changeGear(); //ClassCastException might be thrown, so should be used with caution
//Here RangeRover is a type of car, and to get the specific methods of Car, object should be of Car type,
//so that common methods of Vehicle and Car can be accessed in this way
		Car c=(Car)v;
		c.changeGear();
		c.drive();		
	}

}

abstract class Vehicle {
	abstract void drive();

	void applyBrake() {
		System.out.println("Brake applied");
	}
}

abstract class Car extends Vehicle{
//as Car is not overriding declared method of Vehicle, Car becomes abstract class
	void changeGear() {
		System.out.println("Gear has been changed");
	}
}

class RangeRover extends Car{
	@Override
	void drive() {
//		System.out.println("RangeRover is driven");
	}
}