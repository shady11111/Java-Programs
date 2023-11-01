package com.example.OOPS.Interface;

public class Functional {
	public static void main(String[] args) {
//		Functional object =new B();
//		object.show();
		
		SAM object1=new SAM() {
			public void show() {
				System.out.println("in Functional show");
			}
		};
		object1.show();
		
		ParameterizedSam object2=i-> System.out.println("in Functional parameterized show");
		object2.show(2);
		
		ParameterizedReturnSAM object3=(i,j)->i+j;
		int result=object3.add(8,4);
		System.out.println("Result in ParameterizedReturnSAM is "+ result);
	}
}
//class B implements Functional{
//public void show() {
//	System.out.println("in show");
//}
//}