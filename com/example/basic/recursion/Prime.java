package com.example.basic.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.print("Enter a range to get all the prime numbers:");
			int start = scn.nextInt();
			int end = scn.nextInt();
			ArrayList<Integer> primeNumbers=prime(start,end);
			System.out.println("Prime numbers in the range " + start + " to "+end+" is:");
			for(int prime:primeNumbers)
				System.out.print(prime+" ");
		}
	}

	private static ArrayList<Integer> prime(int start, int end) {
		ArrayList<Integer> prime=new ArrayList<Integer>();
		for(int i=start;i<=end;i++)
			if(primeCheck(i,2))
				prime.add(i);
		return prime;
	}

	private static boolean primeCheck(int number,int i) {
		if(number<=1)return false;
		if(i>number/2)return true;
		if(number%i==0)return false;
		return primeCheck(number,i+1);
	}	
}
