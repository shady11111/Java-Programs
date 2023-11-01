package com.example.OOPS.UpDownCast;

public class Demo5 {

	public static void main(String[] args) {
		X x1=new X();
		x1.show1();
		
		X x2=new Y();
		x2.show1();
		
		x2=(X)new Y();
		x2.show1();
		
		Y y1=new Y();
		y1.show1();
		y1.show2();
		X x3=(X)y1;
		x3.show1();
		
		Y y2=(Y)x2;
		y2.show1();
		y2.show2();
	}

}
class X{
	void show1() {
		System.out.println("in show1 X");
	}
}
class Y extends X{
	void show1() {
		System.out.println("in show1 Y");
	}
	void show2() {
		System.out.println("in show2 Y");
	}
}
