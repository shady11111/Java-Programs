package com.example.basic.conditionalStatements;
import java.util.Scanner;

public class ATMWIthdraw {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int amount;
		boolean checkFlag=false;
		while(!checkFlag) {
			System.out.println("Please enter the amount:");
			amount=scn.nextInt();
			if(amount%10==0) {
				checkFlag=true;
				
				if(amount>=2000) {
					System.out.println("2000's note is = "+amount/2000);
					amount%=2000;
				}
				if(amount>=500) {
					System.out.println("500's note is = "+amount/500);
					amount%=500;
				}
				if(amount>=100) {
					System.out.println("500's note is = "+amount/100);
					amount%=100;
				}
				if(amount>=50) {
					System.out.println("500's note is = "+amount/50);
					amount%=50;
				}
				if(amount>=20) {
					System.out.println("500's note is = "+amount/20);
					amount%=20;
				}
				if(amount>=10) {
					System.out.println("500's note is = "+amount/10);
					amount%=10;
				}
			}
			else{
				System.out.println("Please enter the right amount, dimes are not given in ATM");
				scn.nextLine();
			}
		}
		scn.close();
	}

}
