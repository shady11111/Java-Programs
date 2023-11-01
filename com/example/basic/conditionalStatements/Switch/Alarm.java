package com.example.basic.conditionalStatements.Switch;
import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the day:");
			String day=scn.next();
//switch used with ->
			switch(day.toLowerCase()) {
			case "saturday","sunday"->System.out.println("It's " +day + "7 AM");
			default->System.out.println("It's " +day + "5 AM");
			}
		}
	}

}
