package com.example.Regex;

import java.util.Scanner;
import java.util.regex.*;

public class PhoneNumberValidation {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number:");
			String phone=scanner.next();
			Pattern p=Pattern.compile("[6-9][0-9]{9}");
			Matcher m=p.matcher(phone);
			if(m.matches())
				System.out.println(phone+" is a valid phone number");
			else
				System.out.println(phone+" is not a valid phone number");
		}
	}
}