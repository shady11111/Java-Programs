package com.example.OOPS.thisKeyword;
//"this" can be used to Pass the Current Object:
public class Cars {

	public static void main(String[] args) {
		Car car1=new Car("BMW");
		car1.start();
	}

}
class Car{
	String model;
	Car(String model){
		this.model=model;
	}
	void start() {
		System.out.println(model+" is starting.");
		Engine.start(this);//Pass the current Car object
	}
}
class Engine{
	public static void start(Car car){
		System.out.println("Engine starts in "+car.model+".");
	}
}