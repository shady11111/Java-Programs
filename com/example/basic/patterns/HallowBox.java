package com.example.basic.patterns;

import java.util.Scanner;

public class HallowBox {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number for the size:");
			int size = scn.nextInt();
			for (int i = 1; i <= size; i++) {
				for (int j = 1; j <= size; j++) {
					if(j==1||i==1||i==size||j==size)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
	}
}
