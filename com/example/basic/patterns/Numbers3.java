package com.example.basic.patterns;

import java.util.Scanner;

public class Numbers3 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number for the size:");
			int size = scn.nextInt();
			int length=size+1;
			for(int i=1;i<=size;i++) {
				for(int k=length;k<=size;k++) {
					System.out.print(k+" ");
				}
				for(int j=1;j<=size-i+1;j++) {
					System.out.print(j+" ");
				}
				length--;
				System.out.println();
			}
		}
	}
}
