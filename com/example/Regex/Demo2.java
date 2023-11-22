package com.example.Regex;

import java.util.regex.*;

public class Demo2 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("b[ab]c");
		Matcher m1=p.matcher("bbb");
		Matcher m2=p.matcher("backed");
		
		while(m1.find()){
			System.out.println(m1.start());
			System.out.println(m1.end());
			System.out.println(m1.group());
		}
		while(m2.find()){
			System.out.println(m2.start());
			System.out.println(m2.end());
			System.out.println(m2.group());
		}
// the m1 matcher will not match, and the print statements inside its loop will not be executed.
//Only the m2 matcher will find a match, and its corresponding print statements will be executed.
	}
}
