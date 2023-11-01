package com.example.basic.patterns;

import java.util.Scanner;

public class X {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number for the size:");
			int size = scn.nextInt();
			for(int i=1;i<=size;i++) {
				for(int j=1;j<=size;j++) {
					if(i==j||i+j==size+1) {
						System.out.print("* ");
						continue;
					}
					System.out.print("  ");					
				}
				System.out.println();
			}
		}
	}

}
