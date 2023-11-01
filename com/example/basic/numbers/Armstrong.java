package com.example.basic.numbers;

import java.util.Scanner;

public class Armstrong {// also known as narcissistic number or pluperfect digital invariant

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number to check its armstrongness:");
			int num = scn.nextInt();
			System.out.println(isArmstrong(num));
		}
	}

	private static boolean isArmstrong(int number) {
		int num = number;
		int n = number;
		int count = 0;
		
		//count digits
		while (n > 0) {
			count++;
			n /= 10;
		}
		
		int sum = 0;
		while (num > 0) {
			int check = count;
			int d = num % 10;
			int product = 1;
			while (check > 0) {
				product *= d;
				check--;
			}
			sum += product;
			num /= 10;
		}		
		return sum == number;
	}

}
