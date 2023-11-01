package com.example.basic.patterns;

import java.util.Scanner;

public class Numbers2 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number for the size:");
			int size = scn.nextInt();
			int spaces=size-1;
			int horizontalLength=1;
			for(int i=1;i<=size;i++) {
				for(int j=1;j<=spaces;j++) {
					System.out.print("  ");
				}
				int number=i;
				for(int j=1;j<=horizontalLength;j++) {
					System.out.print(number+" ");
					if(j<=horizontalLength/2) {
						number--;
					}
					if(j>(horizontalLength/2)) {
						number++;
					}
				}
				horizontalLength+=2;
				spaces--;
				System.out.println();
			}
		}
	}

}
