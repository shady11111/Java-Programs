package com.example.basic.Scanner;
import java.util.Scanner;

public class ScannerMethods {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);//Scanner object scn reads input from the keyboard
		System.out.println("Enter the value:");//if one word is entered, then cursor waits for the second word to be entered
		String a =scn.next();//Reads until a whitespace character
		String b=scn.next();//prolly stops here
		//can have nextLine instead
		System.out.println(a+" "+b);
		scn.close();
	}
}
