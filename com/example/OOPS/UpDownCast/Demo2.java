package com.example.OOPS.UpDownCast;

public class Demo2 {

	public static void main(String[] args) {
		A a=new B();
		a.m1();
//		a.m2(); //compilation error
//		a.m3(); //compilation error
	}

}
class A{
	void m1() {
	}
}
class B extends A{
	void m2() {
		
	}
}
class C extends A{
	void m3() {
		
	}
}
