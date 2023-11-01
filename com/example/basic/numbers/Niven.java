package com.example.basic.numbers;

import java.util.Scanner;

public class Niven {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			String checkAgain = "";
			do {
				System.out.println("Enter a number to check if it's niven:");
				int number = scn.nextInt();
				if (niven(number))
					System.out.println(number + " is a niven number");
				else
					System.out.println(number + " is not a niven number");

				System.out.println("Do you want to check again: Enter \"yes\" or \"no\".");
				checkAgain = scn.next().toLowerCase();
			} while (checkAgain.equals("yes")); // while(checkAgain.equalsIgnoreCase("yes")

		}
	}

	private static boolean niven(int number) {
		int num = number;

		int sum = 0;
		while (num > 0) {
			int d = num % 10;
			sum += d;
			num /= 10;
		}
		if (number % sum == 0)
			return true;
		return false;
	}

}
