package com.example.OOPS.InitBlocks;

public class Demo {

	public static void main(String[] args) {
		new A();
		new A(5);
		
//		Output:
//			static
//			non-static
//			non-static 2
//			Constructor
//			non-static
//			non-static 2
//			Constructor with integer parameter
	}

}
class A{
	A(){
		System.out.println("Constructor");
	}
	A(int i){
		System.out.println("Constructor with integer parameter");
	}
	static {
		System.out.println("static");
	}
	{
		System.out.println("non-static");
	}
	{
		System.out.println("non-static 2");
	}
}
