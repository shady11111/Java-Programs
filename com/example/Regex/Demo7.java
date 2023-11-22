package com.example.Regex;

import java.util.regex.*;

public class Demo7 {

	public static void main(String[] args) {
		Pattern p1=Pattern.compile("a.b");
		Matcher m1=p1.matcher("a4bab");
//		System.out.println(p1.matcher("a4bab").group());		
		while(m1.find()){
			System.out.println(m1.start());
			System.out.println(m1.end());
			System.out.println(m1.group());
		}
		System.out.println();
		
		Pattern p2=Pattern.compile(".");
//		System.out.println(p2.matcher("abcd"));
		Matcher m2=p2.matcher("abcd");
		while(m2.find()){
			System.out.println(m2.start());
			System.out.println(m2.end());
			System.out.println(m2.group());
			System.out.println();
		}
		System.out.println();
		
		Pattern p3=Pattern.compile("a[.]");
//		System.out.println(p3.matcher("a."));
//		System.out.println(p3.matcher("ab"));
		Matcher m3=p3.matcher("a.");
		while(m3.find()){
			System.out.println(m3.start());
			System.out.println(m3.end());
			System.out.println(m3.group());
		}		
		System.out.println();
		
		Matcher m4=p3.matcher("ab");
		while(m4.find()){
			System.out.println(m4.start());
			System.out.println(m4.end());
			System.out.println(m4.group());
		}
	}
}
