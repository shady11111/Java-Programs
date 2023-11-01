package com.example.OOPS.InnerClass;

public class Demo {

	public static void main(String[] args) {
		Outer.Inner innerReferenceType=new Outer().new Inner();
		innerReferenceType.print();
	}

}
class Outer{
	int i=10;
	class Inner{
		void print() {
			System.out.println("i="+i);
		}
	}
}