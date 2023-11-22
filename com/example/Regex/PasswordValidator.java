package com.example.Regex;

import java.util.Scanner;
import java.util.regex.*;

public class PasswordValidator {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a password of length 6 to 10, with one special character, one capital letter, one number:");
			String password=scanner.next();
			
			String regex="(?=.*[!@#$%^&])(?=.*[A-Z])(?=.*[0-9])[A-Z].{5,9}";
			Pattern p=Pattern.compile(regex);
			Matcher m=p.matcher(password);
			
			if(m.matches())
				System.out.println("Valid password");
			else
				System.out.println("not a valid password");
		}
		
	}
}