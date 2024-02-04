package com.example.OOPS.Overriding;

public class Demo {

	public static void main(String[] args) {
		Phone pp=new Phone();	
		pp.call();//2G Phone
		pp.doorCase();//Casing on
		System.out.println(pp.cost);//1000
		System.out.println();
		
		CameraPhone c=new CameraPhone();
		c.call();//5G Phone		
		c.doorCase();//Casing on
		System.out.println(c.cost);//5000
		System.out.println();
		
		Phone p=new CameraPhone();
		p.call();//5G Phone
		p.doorCase();//Casing on
		System.out.println(p.cost);//1000
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
