package com.example.basic.Loops.For;
import java.util.Scanner;

public class FibonacciReverse {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the length of fibonacci series:");
			int length=scn.nextInt();
			int a=0,b=1,c=0;
			System.out.print(a+" ");
			System.out.print(b+" ");
			for(int i=3;i<=length;i++) {
				c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
			}
			System.out.println(" ");
			//printing reverse fibonacci
			for(int i=length;i>=1;i--) {
				System.out.print(c+" ");
				a=c-a;
				b=c-a;
				c=b;
			}
		}
	}

}
