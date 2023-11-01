package com.example.basic.Loops.While;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number to get its digit's sum:");
			int num=scn.nextInt();
			int sum=0;
			while(num>0) {
				int d=num%10;
				sum+=d;
				num/=10;
			}
			System.out.println(sum);
		}
		
	}

}
