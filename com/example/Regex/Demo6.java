package com.example.Regex;

import java.util.regex.*;

public class Demo6 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("([a-z])\\1*");
		Matcher m=p.matcher("succeeeeessss");
		String s="";
		while(m.find()) {
			String t=m.group();
			s+=t.length()+t.substring(0,1);
		}
		System.out.println(s);
	}
}