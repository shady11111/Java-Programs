package com.example.Generics;

public class Demo {

	public static void main(String[] argument) {
//		DataStructure<String> string=new DataStructure<String>();
		DataStructure<String> string=new DataStructure<>();
		string.add("String type");
		System.out.println(string.get());
		
//		DataStructure<Integer> integer=new DataStructure<Integer>();
		DataStructure<Integer> integer=new DataStructure<>();
//		integer.add(10.0);//error as the type parameter is of type integer
		integer.add(10);
		int i=integer.get();
		System.out.println(i);	
		
//		DataStructure<Object> number=new DataStructure<>();
//		number.add(25);
//		number.add(new DataStructure<Integer>());
////Type safety issue //ClassCastException
//		Integer integerNumber=(Integer)number.get();
//		
//		Double doubleNumber=(Double)number.get();
//		but with the specific type parameter, code doesn't even compile
	}
}
class DataStructure<T>{
	private T datamember;
	void add(T arg) {
		datamember=arg;
	}
	T get() {
		return datamember;
	}
}
@SuppressWarnings("hiding")
class Datatructure<Object>{
	private Object datamember;
	void add(Object arg) {
		datamember=arg;
	}
	Object get() {
		return datamember;
	}
}