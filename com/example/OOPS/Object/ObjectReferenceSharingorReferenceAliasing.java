package com.example.OOPS.Object;

public class ObjectReferenceSharingorReferenceAliasing {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 10;
		System.out.println(c1.radius);
		Circle c2 = c1;
		System.out.println("Address of c1 = "+c1+", and address of c2 = "+c2);
		System.out.println(c2.radius = 20);
		c1 = null;
		System.out.println("Address of c1 = "+c1+", and address of c2 = "+c2);
		// System.out.println(c1.radius);//null pointer exception
		System.out.println(c2.radius);// even though the reference c1 is set to null, c2 is referring to the same
										// circle object
		c1=new Circle();//referring to new circle object
		System.out.println("Address of c1 = "+c1+", and address of c2 = "+c2);
		System.out.println(c1.radius);
	}
}

class Circle {
	int radius;
}




