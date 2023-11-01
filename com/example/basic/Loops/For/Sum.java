package com.example.basic.Loops.For;

public class Sum {

	public static void main(String[] args) {
		int sum=0;
		int j=1000;
		//update expressions can have any number of statements
		for(int i=1;i==1||i==2||i==3||i==4||i==5;i++,j/=5 /*cannot write j+20, as it will never update j value, as it's not equated to j*/) {
			sum+=i;
			System.out.println(j);
		}
		System.out.println(sum);
	}

}
