package com.example.basic.numbers;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number and the power of the number");
			int number=scn.nextInt();
			int power=scn.nextInt();
			System.out.println(power(number,power));
		}
		
	}
	private static int power(int number, int power) {
		int result=1;
		while(power>0) {
			result=result*number;
			power--;
		}
		return result;
	}

}
