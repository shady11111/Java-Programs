package com.example.OOPS.Coupling;

public class Aggregation {

	public static void main(String[] args) {
		A a=new A(new B());
		a.m1();
	}
}
class B{
	void m2() {
		System.out.println("B");
	}
}
class A{
	B b;
	A(B b){
		this.b=b;
	}
	void m1() {
		b.m2();
	}
}