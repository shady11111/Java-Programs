package com.example.OOPS.Constructor;

public class ParameterizedConstructor {

	public static void main(String[] args) {
	//	new C(); //compile time error
		new C(5);
	}

}
class C{
	C(int i){
		System.out.println("class C has a parameterized constructor.");
	}
}