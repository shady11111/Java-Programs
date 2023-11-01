package com.example.basic.recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number to find it's factorial:");
			//int number = scn.nextInt();
			System.out.println(factorial(scn.nextInt()));
		}
	}

	private static int factorial(int number) {
		if(number<=1)return 1;
		//return number*factorial(number--); //number is decremented later, as it is number--
		return number*factorial(--number);
		//return number*factorial(number-1); //works fine
	}

}
