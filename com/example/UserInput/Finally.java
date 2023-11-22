package com.example.UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finally {

	public static void main(String[] args) throws NumberFormatException,  IOException {
		int number=0;
		BufferedReader br=null;
		
		try {
			System.out.println("Enter a number:");
//			InputStreamReader in=new InputStreamReader(System.in);
//			br=new BufferedReader(in);
			br=new BufferedReader(new InputStreamReader(System.in));
			number=Integer.parseInt(br.readLine());
			System.out.println(number);
		}
		finally {
			br.close();
		}
	}
}
