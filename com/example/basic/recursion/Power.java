package com.example.basic.recursion;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number and it's power to print number's power:");
			int number = scn.nextInt();
			int power=scn.nextInt();
			System.out.println(number+" power "+ power +" is "+power(number,power));
		}
	}
	private static double power(int number, int power) {
		if(power==0)return 1.0;
		else if(power>0)
			return number*power(number,power-1);
		else
			return 1.0/(number*power(number,power+1));
	}
}