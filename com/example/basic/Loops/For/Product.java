package com.example.basic.Loops.For;

public class Product {

	public static void main(String[] args) {
		int product=1;
		String p="";
		for(int i=1;i<=5;i++) {
			product*=i;
			p+=i;
			if(i<5)p+="*";
		}
		System.out.println(p+"="+product);
	}

}
