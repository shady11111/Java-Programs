package com.example.basic.Loops.For;

public class Sum2 {

	public static void main(String[] args) {
		int sum=0;
		String s="";
		for(int i=1;i<=5;i++) {
			sum+=i;
			s+=i;
			if(i<5)s+="+";
		}
		System.out.println(s+"="+sum);
	}

}
/*
 int sum=0;
		String s="";
		for(int i=0;i<=5;i++) {
			sum+=i;			
			if(i==1) {
				s=i+"+";
				continue;
				}
			if(i==5) {
				s=s+i;
				break;
			}
			s=s+i+"+";
		}
		System.out.println(s+"="+sum);
 */
