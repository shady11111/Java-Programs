package com.example.OOPS.Exception;

public class Demo4 {

	public static void main(String[] args) {
		int i=20;
		int j=0;
		
		try {
			j=18/i;
			if(j==0)
				throw new ArithmeticException("don't want to print zero"); //parameterized constructor
		}
		catch(ArithmeticException e){
			j=18/1;
			System.out.println("let the default output be "+j+", 'cause "+e);
		}
		System.out.println(j);
	}
}
