package com.example.basic.conditionalStatements.Switch;
import java.util.Scanner;

public class Alarm2 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a day:");
			String day=scn.next();
			int alarm;
//switch with direct assignment
			switch(day.toLowerCase()) {
			case "saturday","sunday"->alarm=7;
			default->alarm=5;
			}
			System.out.println(alarm);
		}
	}

}
