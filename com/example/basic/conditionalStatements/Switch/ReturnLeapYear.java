package com.example.basic.conditionalStatements.Switch;

public class ReturnLeapYear {

	public static void main(String[] args) {
		int month = 2;
//switch used with -> and yield and as it is returning a value which is equated to a variable it's an expression and should end with ;
		int days = switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				yield 31; // Return 31 days
			}
			case 4, 6, 9, 11 -> {
				yield 30; // Return 30 days
			}
			case 2 -> {
				yield 28; // Return 28 days (assuming a non-leap year)
			}
			default -> {
				yield -1; // Return -1 for invalid months
			}
		};
		
		System.out.println("Days in month " + month + ": " + days);
	}

}
