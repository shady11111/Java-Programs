package com.example.basic.numbers;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number to check its strongness:");
			int number = scn.nextInt();
			System.out.println(isStrong(number));
		}
	}
	
	private static boolean isStrong(int number) {
		int num=number;
		int sum=0;
		while(num>0) {
			int d=num%10;
			sum+=factorial(d);
			num/=10;
		}				
		return sum==number;
	}
	
	private static int factorial(int number) {
		if(number==0 || number==1)
			return 1;

		int result=1;
		for(int i=2;i<=number;i++)
			result*=i;		
		return result;
	}

}
