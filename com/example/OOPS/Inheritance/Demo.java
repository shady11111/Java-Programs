package com.example.OOPS.Inheritance;

public class Demo {

	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.i);
		System.out.println(b.j);
		b.m2();
		b.m1();
	}
}
class A{
	int i=1;
	void m1() {
		System.out.println("A");
	}
}
class B extends A{
	int j=2;
	void m2() {
		System.out.println("B");
	}
}