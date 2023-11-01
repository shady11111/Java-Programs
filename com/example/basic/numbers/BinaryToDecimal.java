package com.example.basic.numbers;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a decimal number to see it in binary:");
			int binary=scn.nextInt();
			System.out.println("Binary value of "+binary+" is "+decimal(binary));
		}
		
	}
	
	private static int decimal(int binary) {
		int multipleOfTwo=1;
		int decimal=0;
		while(binary>0) {
			int remainder=binary%10;
			decimal=decimal+remainder*(multipleOfTwo);
			binary/=10;
			multipleOfTwo*=2;
		}
		return decimal;
	}

}
