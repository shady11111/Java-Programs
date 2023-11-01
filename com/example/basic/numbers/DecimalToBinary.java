package com.example.basic.numbers;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a decimal number to see it in binary:");
			int decimal=scn.nextInt();
			System.out.println("Binary value of "+decimal+" is "+binary(decimal));
		}
		
	}
	
	private static int binary(int decimal) {
		int binary=0;
		int pushRemainder=1;
		while(decimal>=1) {
			int sum=decimal%2;
			binary=binary+sum*pushRemainder;
			decimal/=2;
			pushRemainder*=10;
		}
		System.out.println(binary);
		return binary;
	}

}
