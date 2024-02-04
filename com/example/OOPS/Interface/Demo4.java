package com.example.OOPS.Interface;

public class Demo4 {

	public static void main(String[] args) {
		I1 i1=new X();
		i1.m1();
		
		I2 i2=new X();
		System.out.println(i2.m2());
	}
}
interface I1{
	void m1();
	boolean m2();
}
interface I2{
	void m1();
	boolean m2();
}
class X implements I1,I2{

	@Override
	public void m1() {
		System.out.println("X");
	}
	@Override
	public boolean m2() {
		return true;
	}	
}