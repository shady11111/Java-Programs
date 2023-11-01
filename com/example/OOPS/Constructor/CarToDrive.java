package com.example.OOPS.Constructor;

public class CarToDrive {

	public static void main(String[] args) {
		Driver d1=new Driver();
		Car c1=new Car();
		Car c2=new Car();
		d1.drive(c1);
		d1.drive(c2);
	}

}
class Car{
	int registrationNumber;
	static int n=1000;
	Car(){
		registrationNumber=++n;
	}
	void start() {
		System.out.println(registrationNumber+" car starts");
	}	
	void stop() {
		System.out.println(registrationNumber+" car stops");
	}
}
class Driver{
	void drive(Car c){
		c.start();
		c.stop();
	}
}
