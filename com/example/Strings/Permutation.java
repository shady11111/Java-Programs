package com.example.Strings;

import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		try(Scanner scn=new Scanner(System.in)){
			System.out.println("Enter word to permute:");
			String word=scn.next();
			permute(word,0,word.length()-1);	
		}
	}
	static void permute(String word, int start, int end) {
		if(start==end) {
			System.out.println(word);
			return;
		}
		for(int i=start;i<=end;i++) {
			String anotherWord=swap(word, start, i);
			permute(anotherWord, start+1,end);
		}
	}
	static String swap(String word, int i, int j) {
		char[] wordArray=word.toCharArray();
		char temp=wordArray[i];
		wordArray[i]=wordArray[j];
		wordArray[j]=temp;
		return new String(wordArray);
	}
}