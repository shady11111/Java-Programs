package com.example.basic.numbers;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number to check if it's neon:");
			int number = scn.nextInt();
			if (neon(number))
				System.out.println(number + " is a neon number");
			else
				System.out.println(number + " is not a neon number");
		}
	}

	private static boolean neon(int number) {
		int square = number * number;

		int sumOfSquare = 0;
		while (square > 0) {
			int d = square % 10;
			sumOfSquare += d;
			square /= 10;
		}

		int sumOfDigit = 0;
		while (number > 0) {
			int d = number % 10;
			sumOfDigit += d;
			number /= 10;
		}

		if (sumOfSquare == sumOfDigit)
			return true;

		return false;
	}

}
