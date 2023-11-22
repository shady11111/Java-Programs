package com.example.Regex;

import java.util.regex.*;

public class Demo4 {

	public static void main(String[] args) {
		Pattern p1=Pattern.compile("([a-z])([a-z])\\1");
		Matcher m=p1.matcher("abadfe");
		while(m.find()) {
			System.out.println(m.group());
		}
		System.out.println();
		
		Pattern p2=Pattern.compile("([a-z])\\1");
		m=p2.matcher("success");
		while(m.find())
			System.out.println(m.group());
		System.out.println();
		
//		Pattern p3=Pattern.compile("([a-z])\\1\\1\\1\\1");
		Pattern p3=Pattern.compile("([a-z])\\1{4}");
		m=p3.matcher("succcceeeeess");
		while(m.find())
			System.out.println(m.group());
		System.out.println();
		
		Pattern p4=Pattern.compile("([a-z])\\1+");
		m=p4.matcher("succcccceeess");
		while(m.find())
			System.out.println(m.group());
		System.out.println();
		
		Pattern p5=Pattern.compile("([a-z])\\1*");
		m=p5.matcher("succcccceeess");
		while(m.find())
			System.out.println(m.group());
	}
}