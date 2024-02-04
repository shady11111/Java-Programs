package com.example.Strings;

public class MutableStrings {
//Difference between StringBuffer and StringBuilder
//    -- StringBuffer is thread safe
//    -- StringBuilder is not thread safe


	public static void main(String[] args) {
		StringBuffer sbEmpty=new StringBuffer();
		System.out.println(sbEmpty.capacity());//16
		
		StringBuffer sb=new StringBuffer("Hey!");
		System.out.println(sb);//Hey!
		System.out.println(sb.capacity());//20
		System.out.println(sb.length());//4
		
		sb.append(" you");
		//sb=sb.append(" you");
		//it's not written in this way, yet as StringBuilder and StringBuffer are mutable, they change this way
		System.out.println(sb);//Hey! you
		System.out.println(sb.capacity());//20
		
//Conversion of stringbuffer to string
		String s=sb.toString();
		System.out.println(s);//Hey! you
		
		sb.deleteCharAt(3);
		System.out.println(sb);//Hey you
		
		sb.insert(3,'!');
		sb.insert(4, "!!");
		System.out.println(sb);//Hey!!! you
	}

}
