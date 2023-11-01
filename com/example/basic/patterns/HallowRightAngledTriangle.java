package com.example.basic.patterns;

import java.util.Scanner;

public class HallowRightAngledTriangle {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number for the size:");
			int size = scn.nextInt();
			for (int i = 1; i <= size; i++) {
				for (int j = 1; j <= i; j++) {
					if(j==1||i==size||j==i) {
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
