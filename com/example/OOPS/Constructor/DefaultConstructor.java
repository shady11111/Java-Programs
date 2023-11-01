package com.example.OOPS.Constructor;

public class DefaultConstructor {
	public static void main(String[] args) {
		new A();
		new B();
	}
}

class A {
	A() {
		System.out.println("Default constructor of A");
	}
}
class B{
	//for class B default constructor is added by Java compiler
}