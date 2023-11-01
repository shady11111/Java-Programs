package com.example.basic.numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter two numbers to get all prime numbers in that range:");
			int a = scn.nextInt();
			int b = scn.nextInt();

			if (a > b) {
				a = a + b;
				b = a - b;
				a = a - b;
			}

			ArrayList<Integer> primeNumbers = primeNumber(a, b);
			System.out.println("Perfect numbers in the range [" + a + ", " + b + "]:");
			if (primeNumbers.isEmpty())
				System.out.println("No prime numbers in the range.");
			for (int number : primeNumbers)
				System.out.print(number + " ");
		}
	}

	private static ArrayList<Integer> primeNumber(int a, int b) {
		ArrayList<Integer> primeNumbers = new ArrayList<>();

		for (int i = a; i <= b; i++)
			if (isPrime(i))
				primeNumbers.add(i);

		return primeNumbers;
	}

	private static boolean isPrime(int number) {
		if (number < 2)
			return false;
		for (int i = 2; i <= number / 2; i++)
			if (number % i == 0)
				return false;
		return true;
	}
}
