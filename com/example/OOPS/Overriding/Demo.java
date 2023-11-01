package com.example.OOPS.Overriding;

public class Demo {

	public static void main(String[] args) {
		Phone pp=new Phone();	
		pp.call();
		pp.doorCase();
		System.out.println(pp.cost);
		System.out.println();
		
		CameraPhone c=new CameraPhone();
		c.call();
		c.doorCase();
		System.out.println(c.cost);
		System.out.println();
		
		Phone p=new CameraPhone();
		p.call();
		p.doorCase();
		System.out.println(p.cost);
	}
}
class Phone{
	int cost=1000;
	void call() {
		System.out.println("2G Phone");
	}
	void doorCase() {
		System.out.println("Casing on");
	}
}
class CameraPhone extends Phone{
	int cost=5000;
	void camera() {
		System.out.println("opens a camera");
	}
	void call() {
		System.out.println("5G Phone");
	}
}
