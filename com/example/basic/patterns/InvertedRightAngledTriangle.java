package com.example.basic.patterns;

import java.util.Scanner;

public class InvertedRightAngledTriangle {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number for the size:");
			int size = scn.nextInt();
			for (int i = size; i >= 1; i--) {
				for (int j = 1; j <= i; j++)
					System.out.print("* ");
				System.out.println();
			}
		}
	}

}
