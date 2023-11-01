package com.example.basic.Loops.DoWhile;

import java.util.Scanner;

public class Donate {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			String check="";
			do {
			System.out.println("Enter the amount to donate:");
			System.out.println("Amount donated:"+scn.nextInt());
			
			System.out.println("Would you like to donate more?: Enter 'yes' or 'no'.");
			check=scn.next();
			}while(check.equalsIgnoreCase("yes"));
		}
		
		
	}

}

