package com.example.OOPS.StaticNonStatic;

public class Test {

	public static void main(String[] args) {
		A a1=new A();
		a1.i=10;
		System.out.println(a1.i=20);
		A a2=new A();
		System.out.println(a2.i);
		A.j=20;
		//a1.j=20; Static variables can be accessed via object's reference too
		a1.m1();
		a2.m1();
	}

}
class A{
	static int j;
	int i;
	void m1() {
		System.out.println("m1() method: Non static variable: "+i+" and Static Variable: "+j);
	}
	void increment(){
		System.out.print(i+++" ");
		System.out.print(j++);
		System.out.println();
	}
	
	void display() {
		System.out.println("Displaying: Non static variable: "+i+" and Static Variable: "+j);
	}
}
