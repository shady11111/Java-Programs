package com.example.basic.numbers;

import java.util.Scanner;

public class Palindrome extends Reverse {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number to see if it's paindrome:");
			int number = scn.nextInt();
			System.out.println(isPalindrome(number));
		}
	}

	private static boolean isPalindrome(int number) {
		return Reverse.reverse(number) == number;
	}
}

class Reverse {
	static int reverse(int number) {
		int reverse = 0;
		while (number > 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number /= 10;
		}
		System.out.println(reverse);
		return reverse;
	}
}
