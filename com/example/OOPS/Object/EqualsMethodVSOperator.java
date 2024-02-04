package com.example.OOPS.Object;

public class EqualsMethodVSOperator {

	public static void main(String[] args) {
		Circle c1=new Circle(10);
		Circle c2=new Circle(20);
		Circle c3=new Circle(10);
		Circle c4=c1;
//		System.out.println(c1+" "+c2); //if toString is not overridden returns address
//		System.out.println(c1=c2);
//		System.out.println(c1+" "+c2);
		System.out.println("c1=" +c1 +", c2="+ c2+", c3="+c3+", c4="+c4);
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));

		System.out.println(c1==c4);
		System.out.println(c1.equals(c4));
		
		//if equals method of the Object class is not overridden, c1 and c3 addresses are compared and returns false
		System.out.println(c1.equals(c3));
	}
}