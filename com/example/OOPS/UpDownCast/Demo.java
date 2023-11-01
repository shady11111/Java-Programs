package com.example.OOPS.UpDownCast;

public class Demo {

	public static void main(String[] args) {
		Driver d=new Driver();
		d.drive(new Benz());
		Car c=new Car();
		d.drive(c);
	}

}
class Car{
	@Override
	public String toString() {
		return "Car";
	}
}
class Benz extends Car{
	@Override
	public String toString() {
		return "Benz";
	}
}
class Driver{
	void drive(Car c){
		System.out.println("Driving "+c);
//toString() of Object class's is overridden & the reference passed to drive(), invokes actual object's methods, when referenced using the superclass type
	}
}
