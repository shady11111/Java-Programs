package com.example.UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryResource {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int number=0;
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter a number:");
			number=Integer.parseInt(br.readLine());
			System.out.println(number);
		}
	}
}
