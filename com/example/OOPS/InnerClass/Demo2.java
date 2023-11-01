package com.example.OOPS.InnerClass;

public class Demo2 {

	public static void main(String[] args) {
		A a=new A();
		a.show();
		
		A.B b=a.new B();
		b.show();
		
		A.C c=new A.C();
		c.show();
	}
}
class A{
	int i=10;
	public void show() {
		System.out.println("in show - A"+i);
	}
	class B{
		void show() {
			System.out.println("in show - B");
		}
	}
	static class C{
		void show() {
			System.out.println("in show - C");
		}
	}
}
