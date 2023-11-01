package com.example.basic.Loops.For;
import java.util.Scanner;

public class Sum3 {

	public static void main(String[] args) {
		try(Scanner scn=new Scanner(System.in)){
			System.out.println("Enter any 2 numbers");
			int a=scn.nextInt();
			int b=scn.nextInt();
			int c=a>b?a:b;
			if(c==a) {//comparing which number is greater
				a=b;
				b=c;
			}
			/*
			  if(a>b){
			  	a=a+b;
			  	b=a-b;
			  	a=a-b;
			  } 
			 */
			int sum = 0;
			String s="";
			for(int i=a;i<=b;i++) {
				sum+=i;
				s+=i;	
				if(i<b)s+="+";
			}
			System.out.println(s+"="+sum);
		}
	}
}
