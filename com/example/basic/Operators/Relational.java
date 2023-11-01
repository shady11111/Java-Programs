package com.example.basic.Operators;

public class Relational {

	public static void main(String[] args) {
		int a=10, b=7;
		System.out.println(a>b);//true
		System.out.println(a>b+2);//true
		System.out.println(a++>10);//false
		System.out.println(a);//11
		
		System.out.println(a=11);//11
		System.out.println(a==11);//true
		System.out.println(a=b=11);//11
	}
}
