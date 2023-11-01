package com.example.OOPS.StaticNonStatic;

public class Test3 {

	public static void main(String[] args) {
		B b1=new B();
		b1.m1();
		System.out.println(b1.i);
		//System.out.println(b1.j);
		System.out.println(B.j);
	}

}
class B{
	int i;
	static int j;
	void m1() {
		B b=new B();
		System.out.println(b.i=10);
		j=20;
	}
}
