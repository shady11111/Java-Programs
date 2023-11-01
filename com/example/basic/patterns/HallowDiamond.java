package com.example.basic.patterns;

import java.util.Scanner;

public class HallowDiamond {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number for the size:");
			int size = scn.nextInt();
			int spaces=size/2;
			int stars=1;
			for(int i=1;i<=size;i++) {
				for(int j=1;j<=spaces;j++) {
					System.out.print("  ");
				}
				for(int j=1;j<=stars;j++) {
					if(j==1||j==stars){
						System.out.print("* ");
						continue;
					}
					System.out.print("  ");
				}
				if(i<=size/2) {
					spaces--;
					stars+=2;
				}
				else {
					spaces++;
					stars-=2;
				}
				System.out.println();
			}
		}
	}

}
