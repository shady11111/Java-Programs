package com.example.basic.recursion;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter 2 numbers, to start from and end with:");
			int number = scn.nextInt();
			System.out.println("Sum of digits of "+number+" is "+sumOfDigits(number));
		}
	}
	private static int sumOfDigits(int number) {
		if(number==0)return number;
		//int lastDigit=number%10;		
		return number%10+sumOfDigits(number/10);
	}

}
