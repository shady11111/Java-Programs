package com.example.basic.patterns;

import java.util.Scanner;

public class HallowRightAngledTriangle2 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number for the size:");
			int size = scn.nextInt();
			int spaces=size-1;
			int stars=1;
			for(int i=1;i<=size;i++) {
				for(int j=1;j<=spaces;j++) {
					System.out.print("  ");
				}
				for(int j=1;j<=stars;j++) {
					if(j==1||j==stars||i==size) {
						System.out.print("* ");
						continue;
					}
					System.out.print("  ");
				}
				spaces--;
				stars++;
				System.out.println();
			}
			
		}
	}

}
