package com.example.basic.conditionalStatements.Switch;
import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter number from 1 to 7:");
			int day=scn.nextInt();
			String dayName;
			switch(day) {
			case 1:
				dayName="Monday";
				break;
			case 2:
			    dayName = "Tuesday";
			    break;
			case 3:
			    dayName = "Wednesday";
			    break;
			case 4:
			    dayName = "Thursday";
			    break;
			case 5:
			    dayName = "Friday";
			    break;
			case 6:
				dayName = "Saturday";
			    break;
			case 7:
			    dayName = "Sunday";
			    break;
			default:
			    dayName = "Invalid day";
			}
			System.out.println("The day is: " + dayName);
		}
	}

}
