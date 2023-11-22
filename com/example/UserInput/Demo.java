package com.example.UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws IOException{
		System.out.println("Enter a number:");
//		int number=System.in.read();
//		System.out.println(number-48);
//read() of InputStream reads only the first character, so more than one character given to input is not considered
		
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		
		int numberFromString=Integer.parseInt(bf.readLine());
		System.out.println(numberFromString);
		
		bf.close();
	}
}