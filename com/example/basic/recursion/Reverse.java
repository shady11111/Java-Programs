package com.example.basic.recursion;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.print("Enter the number to reverse:");
			int number = scn.nextInt();
			System.out.println(reverse(number));
		}
	}
	
	public static int reverse(int number) {
		return doReverse(number, 0);
	}

	private static int doReverse(int number, int reverse) {
		if(number<=0)return reverse;
		int lastDigit=number%10;
		reverse=reverse*10+lastDigit;
		return doReverse(number/10, reverse);
	}

}
