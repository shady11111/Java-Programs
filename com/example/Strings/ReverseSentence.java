package com.example.Strings;

public class ReverseSentence {

	public static void main(String[] args) {
		String string="Java is Easy";
		String[] stringArray=string.split(" ");
		String reversedSentence="";
		for(int i=stringArray.length-1;i>=0;i--) {
			reversedSentence+=stringArray[i];
			if(i>0)reversedSentence+=" ";
		}
		System.out.println(reversedSentence); //Easy is Java
	}

}
