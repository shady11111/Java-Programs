package com.example.basic.numbers;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number to check its automorphic:");
			int number = scn.nextInt();
			System.out.println(isAutomorphic(number));
		}
	}

	private static boolean isAutomorphic(int number) {
		if (number == 1)
			return true;

		int square = square(number);
		int count = count(number);

		int divisor = 1;
		while (count > 0) {
			divisor *= 10;
			count--;
		}

		return number == square % divisor;
	}

	private static int square(int number) {
		return number *= number;
	}

	private static int count(int number) {
		int count = 0;
		while (number > 0) {
			count++;
			number /= 10;
		}
		return count;
	}

}
