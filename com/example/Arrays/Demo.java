
package com.example.Arrays;

public class Demo {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		System.out.println(a.length);
		System.out.println();
		
		int []b=new int[2];
		b[0]=10;
		b[1]=20;
		for(int e:b)
			System.out.println(e+" ");
		System.out.println();
		
		int [] c=new int[]{1,2,3,4,};
		System.out.println(c.length);		
		System.out.println();
		
		int d[]=new int[1];
		System.out.println(d[0]);
		d[0]=10;
		System.out.println(d[0]);
	}
}