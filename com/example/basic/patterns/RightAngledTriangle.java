package com.example.basic.patterns;

import java.util.Scanner;

public class RightAngledTriangle {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number for the size:");
			int size = scn.nextInt();
			for (int i = 1; i <= size; i++) {
				for (int j = 1; j <= i; j++)
					System.out.print("* ");
				System.out.println();
			}
		}
	}
}
