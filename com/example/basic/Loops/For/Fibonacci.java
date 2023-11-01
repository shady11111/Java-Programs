package com.example.basic.Loops.For;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the length of fibonacci series:");
			int n=scn.nextInt();
			int a=0, b=1, c;
			System.out.print(a+" ");
			System.out.print(b+" ");
			for(int i=1;i<=n-2;i++) {
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
		}
	}

}
