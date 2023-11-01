package com.example.basic.Loops.For;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter length of fibonacci:");
			int n=scn.nextInt();
			long[] fibonacci=new long[n];
			fibonacci[0]=0;
			fibonacci[1]=1;
			//storing the values of fibonacci series
			for(int i=2;i<n;i++)
				fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];

			//printing the series
			for(int i=0;i<n;i++)
				System.out.print(fibonacci[i]+" ");
			System.out.println();
			//printing the series in reverse
			for(int i=n-1;i>=0;i--)
				System.out.print(fibonacci[i]+" ");
		}
		
	}

}
