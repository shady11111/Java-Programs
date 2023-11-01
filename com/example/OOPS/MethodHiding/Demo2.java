package com.example.OOPS.MethodHiding;

public class Demo2 {

	public static void main(String[] args) {
//		C c1=new C();
//		C c2=new D();
//		C c3=new E();
//		c1.m1(); //prints C
//		c2.m1(); //prints C
//		c3.m1(); //prints C
		C.m1();
	}

}
class C{
	static void m1() {
		System.out.println("C");
	}
}
class D extends C{
	static void m1() {
		System.out.println("D");
	}
}
class E extends D{
	static void m1() {
		System.out.println("E");
	}
}
