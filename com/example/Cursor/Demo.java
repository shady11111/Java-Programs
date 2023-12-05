package com.example.Cursor;

import java.util.*;

public class Demo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Vector v = new Vector();

		// Creating three iterators
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator ltr = v.listIterator();

		// Print class names of iterators
		// using getClass() and getName() methods
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(ltr.getClass().getName());
//Objects of Enumeration, Iterator, ListIterator are not created, because they are interfaces.
//Methods like elements(), iterator(), listIterator() are used to create objects.
//These methods have an anonymous Inner Class that extends respective interfaces and return this class object.		
//The $ symbol in reference class name is a proof that concept of inner classes is used
//and these class objects are created. 
	}
}