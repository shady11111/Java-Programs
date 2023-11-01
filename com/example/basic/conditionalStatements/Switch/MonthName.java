package com.example.basic.conditionalStatements.Switch;
import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a month name:");
			String month=scn.nextLine();
			int monthNumber=monthName(month);
			if(monthNumber==0) System.out.println("Invalid month");
			else
				System.out.println("Month number of "+month+"is "+monthNumber);
		}
	}
	public static int monthName(String month) {
		int monthNumber;
//		if(month==null)
//			return monthNumber;
//switch with String as parameter		
		switch(month.toLowerCase()) {
		default:
			monthNumber=0;
			break;
		case "january":
			monthNumber=1;
			break;
		case "february":
			monthNumber=2;
			break;
		case "march":
			monthNumber=3;
			break;
		case "april":
			monthNumber=4;
			break;
		case "may":
			monthNumber=5;
			break;
		case "june":
			monthNumber=6;
			break;
		case "july":
			monthNumber=7;
			break;
		case "august":
			monthNumber=8;
			break;
		case "september":
			monthNumber=9;
			break;
		case "october":
			monthNumber=10;
			break;
		case "november":
			monthNumber=11;
			break;
		case "december":
			monthNumber=12;
			break;
		}
		return monthNumber;
	}

}
