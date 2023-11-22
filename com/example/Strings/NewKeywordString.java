package com.example.Strings;

public class NewKeywordString {

	public static void main(String[] args) {
		String s1="abcd";
		String s2="abcd";
		String s3=new String("abcd");
		String s4=new String("abcd");
		System.out.println(s2+" "+s3);//abcd abcd
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//false
		System.out.println(s3==s4);//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s4.equals(s3));//true
		
		String s5="Javadev";
		String s6="Java"+"dev";
		System.out.println(s5==s6);//true
		
		String s7="Java";
		String s8=s7+"dev";
		System.out.println(s5==s8);//false
//s8 is a variable, as s8 depends on value of s7 and s8 gets created in heap area
//only constant value gets stored in SCP
		
		String s9=new String();
		System.out.println(s9);
		System.out.println("Above sentence printed nothing, but only the cursor moved in there, 'cause of println()");
		s9=new String("your name");
		System.out.println("Hello "+s9);
		
		String firstName=new String("First name ");
		System.out.println(firstName.concat("last name"));
	}
}