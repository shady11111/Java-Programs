package com.example.basic.Scanner;
import java.util.Scanner;

public class ImprovedScannerMethod {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value:");
		String inputLine=scn.nextLine();
		String[] words=inputLine.split("\\s+");//splits based on whitespace
		if(words.length>=2) {
			String a=words[0];
			String b=words[1];
			StringBuilder restOfTheWords=new StringBuilder();
			for(int i=2;i<words.length;i++) {
				restOfTheWords.append(words[i]);
				if(i<words.length-1) {
					restOfTheWords.append(" ");
				}
			}
			System.out.println("a="+a+" ,b="+b);
			System.out.println(restOfTheWords);
		}
		else {
			System.out.println("not enough input words");
		}
		scn.close();
	}

}
