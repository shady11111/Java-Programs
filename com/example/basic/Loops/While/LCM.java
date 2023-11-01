package com.example.basic.Loops.While;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter 2 numbers to get their LCM:");
			int a=scn.nextInt();
			int b=scn.nextInt();
			int c=a>b?a:b;
			if(c==a) {
				a=a+b;
				b=a-b;
				a=a-b;
			}
			int am=1;
			int bm=1;
			int lcm;
			while(true) {
				lcm=am*a;
				if(lcm%(bm*b)==0)break;
				am++;
				if(a*am>b*bm)bm++;
			}
			System.out.println(lcm+" is the LCM");
		}
	}

}
