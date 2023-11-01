package com.example.basic.conditionalStatements.Switch;
import java.util.Scanner;

public class Alarm3 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a day:");
			String day=scn.next();
//switch with direct return
			int alarm=switch(day.toLowerCase()) {
			case "saturday","sunday"->7;
			default->alarm=5;
			};
			System.out.println(alarm);
		}
	}

}
