package com.example.OOPS.thisKeyword;

public class Test {

	public static void main(String[] args) {
		A a1=new A();
		a1.j=30;
		a1.m1();
		A a2=new A();
		a2.j=100;
		a2.m1();
	}
}

class A{
	static int i=10;
	int j;
	void m1() {
		int j=20;
		System.out.println(j);
		System.out.println(this.j);
		System.out.println(A.i);
		A.i+=1000;
	}
}
