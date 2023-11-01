package com.example.OOPS.Interface;

public class Demo2 {

	public static void main(String[] args) {
		Interface i1=new A();
		Interface i2=new B();
		i1.show();
		i2.show();
		System.out.println(Interface.age+" : "+Interface.name);
	}
}
interface Interface{
	int age=4;
	String name="AB";
	void show();
}
class A implements Interface{
	public void show() {
		System.out.println("in show A");
	}
}
class B extends A{
//	public void show() {
//		System.out.println("in show B");
//	}
}