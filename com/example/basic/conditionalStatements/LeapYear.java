package com.example.basic.conditionalStatements;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter an year to check:");
			int year=scn.nextInt();
			if(year<100 && year%4==0)System.out.println(year+" is a leap year");
			
			else if((year%4==0&&year%100!=0)||year%400==0) {
				System.out.println(year+" is a leap year");
			}
			else
				System.out.println(year+" is not a leap year");
		}
	}

}
