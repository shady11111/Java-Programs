package com.example.OOPS.Constructor.SingletonClass;

public class Demo {

	public static void main(String[] args) {
		A a1=A.getObjectA();
		A a2=A.getObjectA();
		System.out.println(a1==a2); //same object go created, hence references have same address
		B b1=new B();
		B b2=new B();
		System.out.println(b1==b2);
	}
}
class A{
	private static A object =null;
	private A() {		
	}
	public static A getObjectA() {
		if(object ==null)object=new A();
		return object;
	}
}
class B{
	B(){		
	}
}