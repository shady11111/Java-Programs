package com.example.Strings;

import java.util.Scanner;

public class PalindromePieces {

	public static void main(String[] args) {
		try(Scanner scn=new Scanner(System.in)){
			System.out.println("Enter a string to check if it's palindrome:");
			String stringToCheck=scn.nextLine();
			System.out.println("Palindrome words in "+stringToCheck+" is:");
			for(int i=0;i<stringToCheck.length()-1;i++) {
				for(int j=i+1;j<stringToCheck.length();j++) {
					if(palindromePieceCheck(stringToCheck,i,j))
						System.out.println(stringToCheck.substring(i, j+1));
					//in substring(i,j) - i is inclusive, j is exclusive, j-1 is inclusive, goes from i to j-1
				}
			}
		}
	}
	static boolean palindromePieceCheck(String stringToCheck, int start, int end) {
		char[] charString=stringToCheck.toLowerCase().toCharArray();
		while(start<end) {
			if(charString[start]!=charString[end])return false;
			start++;
			end--;
		}
		return true;
	}
}