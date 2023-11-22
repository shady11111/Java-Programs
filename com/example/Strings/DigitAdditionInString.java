package com.example.Strings;

import java.util.Scanner;

public class DigitAdditionInString {

	public static void main(String[] args) {
		try(Scanner scn=new Scanner(System.in)){
			System.out.println("Enter a string with numbers to get the addition:");
			String word=scn.next();
			System.out.println("Sum of digits in "+word+" is "+digitAdditionInString(word));
		}
	}
	static int digitAdditionInString(String word){
		int sum=0;
		for(int i=0;i<word.length();i++) {
			char character=word.charAt(i);
			if(character>='0'&&character<='9')sum+=(character-'0');
//ASCII character encoding '1'-'0'-> 49-48=1, implicit conversion of character to bigger size integer
		}
		return sum;
	}
}