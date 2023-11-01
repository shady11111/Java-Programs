package com.example.basic.Loops.While;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter 2 numbers to find their HCF:");
			int a=scn.nextInt();
			int b=scn.nextInt();
			int c=a>b?a:b;
			if(c==a) {
				a=a+b;
				b=a-b;
				a=a-b;
			}
			while(b!=0) {
				int temp=a;
				a=b%a;
				b=temp;
			}
			
			System.out.println(b);
		}
		
	}

}
