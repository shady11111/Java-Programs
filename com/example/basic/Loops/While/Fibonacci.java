package com.example.basic.Loops.While;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter length of fibonacci series");
			int length=scn.nextInt();
			int a=0, b=1, c, count=3;
			System.out.print(a+" ");
			System.out.print(b+" ");
			while(true) {
				if(count>length)return;
				
				c=a+b;
				System.out.print(c+" ");
				
				a=b;
				b=c;
				count++;
			}
		}
	}

}
