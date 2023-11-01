package com.example.OOPS.Coupling;

public class Aggregation2 {

	public static void main(String[] args) {
		Car car=new Car(new Engine(1000));
		car.move();
	}
}
class Engine{
	int cc;
	Engine(int cc){
		this.cc=cc;
	}
	void run() {
		System.out.println(cc+" is running");
	}
}
class Car{
	Engine engine;
//	Car(){
//		//no composition
//	}
	Car(Engine engine){//composition
		this.engine=engine;
	}
	void move() {
		engine.run();
	}
}