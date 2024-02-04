package com.example.OOPS.MethodHiding;

public class Demo {

	public static void main(String[] args) {
//		A a=new A();
//		B b=new B();
//		A ab=new B();
//		new A().m1();
//		new B().m1();
//		a.m1();//A
//		b.m1();//B
//		ab.m1();//method shadowing or hiding happens here//prints according to reference//resolved at compile time//A
	}

}
class A{
	static void m1() {
		System.out.println("A");
	}
}
class B extends A{
	static void m1() {
		System.out.println("B");
	}
}