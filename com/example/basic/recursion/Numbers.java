package com.example.basic.recursion;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		try(Scanner scn=new Scanner(System.in)){
			System.out.println("Enter a number:");
			int number=scn.nextInt();
			printNumberPattern1(number);
			System.out.println();
			printNumberPattern2(number);
		}		
	}
	static void printNumberPattern1(int number) {
		if(number<1)return;
		printNumberPattern1(number-1);
		System.out.println(number);		
	}
	static void printNumberPattern2(int number) {
		if(number<1)return;
		System.out.println(number);
		printNumberPattern2(number-1);
	}
}