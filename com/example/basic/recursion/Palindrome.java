package com.example.basic.recursion;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number, to check if it's palindrome:");
			int number = scn.nextInt();
			if (palindromeCheck(number)) {
				System.out.println(number + " is a palindrome.");
				return;
			}
			System.out.println(number + " is not a palindrome.");
		}
	}

	private static boolean palindromeCheck(int number) {
		return reverse(number) == number;
	}

	private static int reverse(int number) {
		return returnReversed(number, 0);
	}

	private static int returnReversed(int number, int reversedNumber) {
		if (number <= 0)
			return reversedNumber;
		int lastDigit = number % 10;
		reversedNumber = reversedNumber * 10 + lastDigit;
		return returnReversed(number / 10, reversedNumber);
	}

}
