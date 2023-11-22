package com.example.OOPS.Exception;

public class Demo2 {

	public static void main(String[] args) {
		int i=18;
		int j=2;
//		String string=null;
		int[] numbers=new int[5];
		
		try {
			j=18/i;
			System.out.println(j);
//			System.out.println(string.length());
			System.out.println(numbers[5]);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
			j=1;
			System.out.println("Default output is "+ j);
		}
//		catch(NullPointerException e) {
//			System.out.println("cannot access from null");
//		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array is out of bound");
		}
		catch(Exception e){
			System.out.println("something went wrong, -- "+e);
		}
		System.out.println(j);
	}
}
