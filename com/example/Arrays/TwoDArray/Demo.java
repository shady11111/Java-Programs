package com.example.Arrays.TwoDArray;

public class Demo {

	public static void main(String[] args) {
		int[][] a=new int[2][];
		a[0]=new int[3];
		a[1]=new int[2];
		
		for(int[] t:a)
			//Address of row 0th array and row 1th array
			//Form of an aggression - an array of arrays, where each element of the outer array is an array itself  
						System.out.println(t);
		
		int [][]b= { {1,2,3},{4,5,6},{7,8,9}};
		System.out.println(b.length);
		
		int c[][]=new int[2][];
		c[0]=new int[2];
		for(int[] t:c)
			System.out.println(t);
//address of 2nd row is null, as it's not created
		
		int e[][]=new int[2][2];
		for(int[] t:e)
//once the size is declared, address is given to the array
			System.out.println(t);
		
		int[][]d={ {1,2,3},{4,5,6},{7,8,9,10}};
		for(int []t:d)
			System.out.println(t.length);
	}
}