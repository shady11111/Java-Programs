package com.example.Strings;

public class Literal {

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		System.out.println(s1+" "+s2);
//as it is string, toString() is overridden to naturally print the content in the object 
		System.out.println(s1==s2);
//here address of references are being compared, as toString() is not overridden, and address is equal.
//as JVM searches in string constant pool, if the value is already present, if so assigns the other reference same address.
		
		String s3=s1;
		System.out.println(s1+" "+s3);//java java
		System.out.println(s1==s3);//true
		s1="python";
		System.out.println(s1+" "+s3);//python java
		System.out.println(s1==s3);//false
		//String is immutable, as value of s3 "java" remains as it is, though s1 gets a new value "python"
		s1=s1.replace('p','d');
		System.out.println(s1);//dython
	}
}