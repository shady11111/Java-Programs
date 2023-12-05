package com.example.Arrays.TwoDArray;

public class PascalPattern {
	public static void main(String[] args) {
		int[][] array=new int[5][];
		int space=4;
		array=pascal(array);
		for(int i=0;i<array.length;i++) {
			for(int k=0;k<space;k++)
				System.out.print("  ");
			for(int j=0;j<array[i].length;j++)
				System.out.print(array[i][j]+" ");
			System.out.println();
			space--;
		}
	}
	public static int[][] pascal(int[][] a){
		for(int i=0;i<a.length;i++) {
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++) {
				if(j==0||i==j)
					a[i][j]=1;
				else
					a[i][j]=a[i-1][j]+a[i-1][j-1];
			}
		}
		return a;
	}
}