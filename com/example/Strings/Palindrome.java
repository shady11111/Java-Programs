package com.example.Strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		try(Scanner scn=new Scanner(System.in)){
			System.out.println("Enter a string to check if it's palindrome:");
			String stringToCheck=scn.nextLine();
			System.out.println("Palindrome check for " +stringToCheck+" has given "+PalindromeCheck.palindromeCheck(stringToCheck));
		}
	}
}
class PalindromeCheck{
	static boolean palindromeCheck(String stringToCheck) {
		char[] charString=stringToCheck.toLowerCase().toCharArray();
		int i=0;
		int j=charString.length-1;
		while(i<j) {
			if(charString[i]!=charString[j])return false;
			i++;
			j--;
		}
		return true;
	}
}