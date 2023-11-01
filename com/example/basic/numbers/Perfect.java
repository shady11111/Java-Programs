package com.example.basic.numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter two numbers to get all perfect numbers in that range:");
			int a = scn.nextInt();
			int b = scn.nextInt();

			if (a > b) {
				a = a + b;
				b = a - b;
				a = a - b;
			}
			ArrayList<Integer> perfectNumbers = perfect(a, b);
			System.out.println("Perfect numbers in the range [" + a + ", " + b + "]:");
			if (perfectNumbers.isEmpty())
				System.out.println("no perfect numbers found in the range.");
			for (int number : perfectNumbers)
				System.out.print(number + " ");
		}
	}

	private static ArrayList<Integer> perfect(int a, int b) {
		ArrayList<Integer> perfectNumbers = new ArrayList<>();

		for (int i = a; i <= b; i++)
			if (isPerfect(i))
				perfectNumbers.add(i);

		return perfectNumbers;
	}

	private static boolean isPerfect(int number) {
		return divisorSum(number) == number;
	}

	private static int divisorSum(int number) {
		int divisorSum = 1;// as perfect number is sum of all it's divisors, excluding the number, but
							// includes 1 as divisor too
		if (number <= 1)
			return 2;// if 2 this condition never divisorSum(number)==number; becomes true
		for (int i = 2; i <= number / 2; i++)
			if (number % i == 0)
				divisorSum += i;

		return divisorSum;
// the below code doesn't work, 'cause it won't find 496 and 8158
//		for (int i = 2; i < number / 4; i++)
//			if (number % i == 0) {
//				divisorSum += i;
//				divisorSum +=number/i;
//			}

// the below code doesn't work, 'cause ex:28, 28/4=7, when i=4, counterpart is 7, and when i=7, counterpart is 4, so it adds 4 and 7 twice
//		for (int i = 2; i < number / 4; i++) {
//			if (number % i == 0) {
//				divisorSum += i;
//				divisorSum +=number/i;
//			}
//		}

	}

}
