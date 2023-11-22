package com.example.Strings;

public class ReverseSentence2 {

	public static void main(String[] args) {
		String string="Java is Easy";
		System.out.println(reverseSentence(string));
	}
	static String reverseSentence(String sentence) {
		char[] reversedSentence=sentence.toCharArray();
		int i=0;int j=reversedSentence.length-1;
		while(i<j) {
			char temp=reversedSentence[i];
			reversedSentence[i]=reversedSentence[j];
			reversedSentence[j]=temp;
			i++;
			j--;
		}
		return new String(reversedSentence);
	}
}
