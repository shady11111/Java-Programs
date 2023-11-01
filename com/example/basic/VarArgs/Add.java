package com.example.basic.VarArgs;

public class Add {

	public static void main(String[] args) {
		System.out.println(add(1,2,3,4));
		System.out.println(add(1,2,3,4,5,6,7,8));
	}
	static int add(int... number) {
		int sum=0;
		for(int n:number)
			sum+=n;
		return sum;
	}

}
