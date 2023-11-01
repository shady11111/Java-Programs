package com.example.basic.recursion;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter 2 numbers, to start from and end with:");
			int start=scn.nextInt();
			int end=scn.nextInt();
			printNumbers(start, end);
		}
	}
	private static void printNumbers(int start, int end) {
		if(start>end)return;
		System.out.println(start);
		printNumbers(start+1, end);
	}

}
