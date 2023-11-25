package com.example.Array.TwoDArray;

public class Multiplication {

	public static void main(String[] args) {
		int [][]a= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		int[][]b= { {1,2,3},
					{4,5,6},
					{7,8,9} };
		
		int c[][]=multiply(a,b);
		
		for(int[]t:c) {
			for(int n:t)
				System.out.print(n+"\t");
			System.out.println();
		}
	}

	private static int[][] multiply(int[][] a, int[][] b) {
		int length=a.length;
		int[][]c=new int[length][length];
		
		for(int i=0;i<length;i++)
			for(int j=0;j<length;j++) {
				int sum=0;
				for(int k=0;k<length;k++)
					sum+=a[i][k]*b[k][j];
				c[i][j]=sum;
			}
		return c;		
	}
	
}