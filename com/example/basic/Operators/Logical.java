package com.example.basic.Operators;

public class Logical {

	public static void main(String[] args) {
		//`!` (Logical NOT)
		int a=1;
		System.out.println(a==0);//false
		//System.out.println(!a==0);//Compilation error. The ! operator is a unary operator for logical negation (logical NOT), and it has a higher precedence than the == operator, which is for equality comparison.
		System.out.println(!(a==0));//true
		
		//&& Logical AND doesn't check the second condition if first is false, 'cause overall anyway it's false
		int b=5,c=6;
		System.out.println(b++>5 && ++c>6);//false
		System.out.println(b);//6
		System.out.println(c);//6
		
		//|| Logical OR doesn't check the second condition if first is true, 'cause overall anyway it's true
		int d=5, e=6;
		System.out.println(d++>=5 || e++>=6);//true
		System.out.println(d);//6
		System.out.println(e);//6
	}

}



