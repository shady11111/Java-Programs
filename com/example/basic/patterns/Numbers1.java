package com.example.basic.patterns;

import java.util.Scanner;

public class Numbers1 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number for the size:");
			int size = scn.nextInt();
			for (int i = 1; i <= size; i++) {
				if (i % 2 == 0) {
					for (int j = 1; j <= size; j++) {
						System.out.print((size * i) + 1 - j+" ");
					}
					System.out.println();
				} else {
					int length = size;
					length *= i;
					for (int k = length + 1 - size; k <= length; k++) {
						System.out.print(k + " ");
					}
//					length++;
					System.out.println();
				}
			}
		}
	}

}
