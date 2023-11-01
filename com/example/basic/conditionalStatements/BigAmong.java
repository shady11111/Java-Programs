package com.example.basic.conditionalStatements;

import java.util.Scanner;

public class BigAmong {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.print("Enter 3 numbers:");
			int a = scn.nextInt();
			int b = scn.nextInt();
			int c = scn.nextInt();			
			int bigAmongThree = (a > b && a > c) ? a : (b > c) ? b : c;
			System.out.println(bigAmongThree);
			
			int d = scn.nextInt();
			int bigAmongFour = (a > b && a > c && a > d) ? a : (b > c && b > d) ? b : c > d ? c : d;
			System.out.println(bigAmongFour);
		}
	}
}
