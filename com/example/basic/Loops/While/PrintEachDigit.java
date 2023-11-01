package com.example.basic.Loops.While;

import java.util.Scanner;

public class PrintEachDigit {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number to seperately print all its digits and to count number of digits:");
			int num=scn.nextInt();
			int count=0;
			while(num>0) {
				count++;
				int d=num%10;
				System.out.print(d+" ");
				num=num/10;
			}
			System.out.println();
			System.out.println(count);
		}
	}

}
