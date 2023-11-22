package com.example.OOPS.Wrapper;

public class Demo2 {

	public static void main(String[] args) {
		Object o=25;//Autoboxing
		//Object o1=new Integer(25);//Autoupcast
		//o.intValue(); //compilation error superclass reference type, cannot access subtype method
		Integer i=(Integer)o;
		i.intValue();
		
	}
}