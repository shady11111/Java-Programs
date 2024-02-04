package com.example.OOPS.Overloading;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(add(5,6));//11
		System.out.println(add(4.0,3,3.0));//7.0
//If no exact match is found, Java looks for the closest matching method based on the data types
//and their compatibility with the provided arguments.
		System.out.println(add(7,8,1));//15.0
		System.out.println(add(4L,6,8L));//implicit type conversion or type coercion//10.0
	}
	
	public static int add(int a, int b) {
		return a+b;
	}	
	public static double add(double a, int b, double c) {
		return a+b;
	}
//	public static int add(int a, int b, int c) {
//        return a + b + c;
//    }

}
