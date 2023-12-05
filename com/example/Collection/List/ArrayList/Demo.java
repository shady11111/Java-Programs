package com.example.Collection.List.ArrayList;

import java.util.ArrayList;

public class Demo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		
		ArrayList a2=new ArrayList();
		a2.add(30);
		a2.add(40);
		
		a1.addAll(a2);
		for(Object o:a1) {
			System.out.print(o+" ");
		}
		System.out.println();
		a1.removeAll(a2);
		for(Object o:a1) {
			System.out.print(o+" ");
		}
		System.out.println();
		a1.addAll(a2);
		a1.retainAll(a2);
		for(Object o:a1) {
			System.out.print(o+" ");
		}
	}
}