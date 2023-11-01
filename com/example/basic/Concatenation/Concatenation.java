package com.example.basic.Concatenation;

public class Concatenation {
	
	public static void main(String[] args) {
		System.out.println(10+20);
		System.out.println("a"+20);
		System.out.println('A'+20);
		System.out.println('A'+"20");
		System.out.println("A"+true);
		   
   /*	System.out.println('A'+true); */
		System.out.println('1'+1);
		System.out.println("1"+2+3);

		int a=5, b=6;
		System.out.println("a"+null);
		System.out.println("a="+a);
		System.out.println("a="+a+",b="+b);
		System.out.println(a+"+"+b+"="+(a+b));
	}
}