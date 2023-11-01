package com.example.basic.Scanner;
import java.util.Scanner;

public class RetryInvalidInput {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		boolean validInput=false;
		while(!validInput) {
		try {
			System.out.println("Enter only quantity:");
			int quantity=scn.nextInt();
			System.out.println(quantity+"is the quantity");
			validInput=true;
		} catch (java.util.InputMismatchException e) {
			System.out.println("Invalid input entered.Please enter a valid input:");
			scn.nextInt();//to swallow the invalid input and clear for next loop, can be next() or nextLine()..etc..
		}
		}
		scn.close();
	}

}
