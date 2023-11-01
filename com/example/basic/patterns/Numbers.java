package com.example.basic.patterns;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number for the size:");
			int size = scn.nextInt();
			for (int i = 1; i <= size; i++) {
				for (int j = 1; j <= size; j++) {
					if(i%2!=0) {
						System.out.print(j+" ");
						continue;
					}
					System.out.print(size+1-j+" ");					
				}
				System.out.println();
			}
		}
	}
}
