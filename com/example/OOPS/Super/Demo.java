package com.example.OOPS.Super;

public class Demo {

	public static void main(String[] args) {
		new B();
		new B(10);
//every time an object of subclass is created, default superclass constructor gets called by Java compiler,
//alongside subclass constructor, if no superclass constructor is added implicitly
//className();
	}
}
class A extends Object{
	A(){
		super();//Object class's constructor
		System.out.println("in A");
	}
	A(int i){
		System.out.println("in int A");
	}
}
class B extends A{
	B(){
		System.out.println("in B");
	}
	B(int i){
		System.out.println("in int B");
	}
}
