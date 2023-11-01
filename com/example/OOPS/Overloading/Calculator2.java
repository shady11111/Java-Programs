package com.example.OOPS.Overloading;

public class Calculator2 {

	public static void main(String[] args) {
		m1(5);//If an exact match is found for the arguments, that method is called.
		//here (int... number) is not the exact match, (int num) is the exact match
		m1(5,6);
		m1();
	}
	public static void m1(int... number) {
		for(int i=0;i<number.length;i++)
			System.out.println(number[i]);
	}
//If an exact match is found for the arguments, that method is called.
	public static void m1(int number) {
		System.out.println(number);
	}

}
