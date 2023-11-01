package com.example.basic.conditionalStatements.Switch;
import java.util.Scanner;

public class DaysAndMonths {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter month and year:");
			int month=scn.nextInt();
			int year=scn.nextInt();
			switch(month) {
			case 2:
				if((year%4==0&&year%100!=0)||year%400==0) {
					System.out.println("29days");
					return;
				}
				System.out.println("28days");
				break;
			case 1:	case 3:	case 5:	case 7:	case 8:	case 10:case 12:
				System.out.println("31days");
				break;
			case 4:	case 6:	case 9:	case 11:
				System.out.println("30days");
				break;
			default:
                System.out.println("Invalid month");
                break;
			}
		}
	}

}
