package com.example.basic.Scanner;
import java.util.Scanner;

public class EmptyLineMoreThanOne {
	//If more than one empty line is encountered, stops reading further
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter");
	String line;
	boolean flag=false;//to check more than one empty line
	while(true) {
		line=scn.nextLine();
		if(line.isEmpty()) {
			if(flag)	break;
			flag=true;
		}
		if(line.trim().isEmpty()) {
	//trim() removes leading and trailing whitespace characters and returns a new string.
			flag=false;
			continue;
		}
		flag=false;
		System.out.println(line);
	}
	scn.close();
}
}
