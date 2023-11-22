package com.example.OOPS.Wrapper;

public class Demo3 {

	public static void main(String[] args) {
		m1("abcd");
		m1(new Demo3());
		m1(10);
		m1('c');
		
	}
	static void m1(Object o) {
		System.out.println(o);
	}
}