package com.example.OOPS.UpDownCast;

public class Demo3 {

	public static void main(String[] args) {
		D d1=new D();
		D d2=new E();
		D d3=new F();
		F f1=new F();
		System.out.println(d1.i);
		System.out.println(d2.i);
		System.out.println(d3.i);
		System.out.println(f1.i);
	}
}
class D{
	int i=1;
}
class E extends D{
	int i=2;
}
class F extends E{
	int i=3;
}
