package com.example.OOPS.Wrapper;

public class Demo {

	public static void main(String[] args) {
		int number1=2;
//		Integer n1=new Integer(number1); //Boxing
		Integer n1=number1; //AutoBoxing
		System.out.println(n1);
		
		Integer n2=9;
		System.out.println(n2);
		
//		int number2=Integer.valueOf(number1); //UnBoxing
//		int number3=n2.intValue();	//UnBoxing
		int number2=n2; //AutoUnBoxing
		System.out.println(number2);
		
		String string="6";
//		System.out.println(string*2); //compilation error
		int number3=Integer.parseInt(string); //AutoUnBoxing
//		Integer number3=Integer.parseInt("6");
		System.out.println(number3*2);
		Integer n3=number3;
		System.out.println(n3*2);
		String s1=""+number3;
//		String s1=String.valueOf(number3);
		String s2=String.valueOf(n3);
//		String s2=""+n3;
		System.out.println(s1+" "+s2);
	}
}