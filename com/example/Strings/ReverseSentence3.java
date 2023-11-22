package com.example.Strings;

public class ReverseSentence3 {

	public static void main(String[] args) {
		String string="Java is Easy";
		String[] wordsArray=string.split(" ");
		System.out.println(wordsArray.length);
		String reversedSentence="";
		for(String s:wordsArray) {
			reversedSentence+=s;
			reversedSentence+=" ";
		}
		System.out.println(reversedSentence.trim());
	}
}