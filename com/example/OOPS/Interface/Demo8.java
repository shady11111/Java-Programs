package com.example.OOPS.Interface;

public class Demo8 {

	public static void main(String[] args) {
		ImplementingBothClass ibm=new ImplementingBothClass();
		ibm.show();
		System.out.println();
		I ibmI=new ImplementingBothClass();
		ibmI.show();
		System.out.println();
		J ibmJ=new ImplementingBothClass();
		ibmJ.show();
		System.out.println();
		
		ImplementingClass im=new ImplementingClass();
		im.show();
	}

}
class ImplementingClass implements I{
	
}
class ImplementingBothClass implements I, J{

	@Override
	public void show() {
		System.out.println("ImplemetingBothClass-show");
		I.super.show();
		J.super.show();
	}
	
}
interface I{
	default void show() {
		System.out.println("I-show");
	}
}
interface J{
	default void show() {
		System.out.println("J-show");
	}
}
