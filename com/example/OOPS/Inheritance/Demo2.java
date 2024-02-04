package com.example.OOPS.Inheritance;

public class Demo2 {

	public static void main(String[] args) {
		D d= new D();
		d.m1();
		
//		Output:
//			C
//			0
	}

}
class C{
	int i;
	void m1() {
		System.out.println("C");
	}
}
class D extends C{
	@Override
	void m1() {
		super.m1();
		System.out.println(super.i);
	}
}
