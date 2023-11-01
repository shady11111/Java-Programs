package com.example.OOPS.Abstract;

public class Demo3 {

	public static void main(String[] args) {
		A a1=new B();
		A a2=new C();
		a1.m1();
		a1.m2();
//		a1.m3(); //not visible
		a2.m1();
		a2.m2();
	}

}
abstract class A{
	abstract void m1();
	void m2() {
		System.out.println("A-m2()");
	}
}
class B extends A{
	void m1() {
		System.out.println("B-m1()");
	}
	void m3() {
		System.out.println("B-m3()");
	}
}
class C extends A{
	void m1() {
		System.out.println("C-m1()");
	}
	void m2() {
		System.out.println("C-m2()");
	}
}