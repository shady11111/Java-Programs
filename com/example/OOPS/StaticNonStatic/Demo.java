package com.example.OOPS.StaticNonStatic;

public class Demo {

	public static void main(String[] args) {
		Mobile object1=new Mobile();
		object1.brand="Apple";
		object1.price=2000;
		Mobile.name="Smartphone";
		
		Mobile object2=new Mobile();
		object2.brand="Samsung";
		object2.price=3000;
		Mobile.name="Smartphone";
		
		Mobile.name="Phone";
		
		object1.show();
		object2.show();
		
		Mobile.show1(object1);
		Mobile.show1(object2);
	}

}
class Mobile{
	String brand;
	int price;
	static String name;
	
	public void show() {
		System.out.println(brand + " : "+price +" : "+name);
	}
	public static void show1(Mobile object) {
//directly non static methods, cannot be used inside a static method, but can be used if used through object reference
//'cause now can be differentiated, which particular object's method is called
		System.out.println(object.brand + " : "+object.price +" : "+name);
	}
}