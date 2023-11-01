package com.example.OOPS.Abstract;

public class Demo4 {

	public static void main(String[] args) {
		new Y();
	}

}
abstract class X{
	X(int i){
		System.out.println("Parameterized constructor of X");
	}
}
class Y extends X{
	Y(){
		super(4);
		System.out.println("Default constructor of Y");
	}
}