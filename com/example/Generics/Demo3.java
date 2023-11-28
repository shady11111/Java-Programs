package com.example.Generics;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		List<Integer> intList=new ArrayList<>();
		intList.add(5);
		intList.add(10);
//Integer is a subclass of Object, but list of Integer is not a subclass of Object
		printList(intList);
		
		System.out.println();
		
		List<Double> doubleList=new ArrayList<>();
		doubleList.add(5.0);
		doubleList.add(10.0);
		printList(doubleList);
	}
//	private static void printList(List<Object> myList) {
//		System.out.println();
//	}
	
//wildcard (<?>) to represent an unknown type
	private static void printList(List<?> myList) {
	    for (Object item : myList) {
	        System.out.println(item);
	    }
	}
	
//	private static void printList(List<?> myList) {
//	    for (var item : myList) {
//	        System.out.println(item);
//	    }
//	}
	
//	private static <T> void printList(List<T> Lists) {
//		for(T list:Lists) {
//			System.out.println(list);
//		}
//	}
//can be bounded generic
//	private static void printList(List<? extends Animal> myList) {
//		System.out.println();
//	}
}