package com.example.OOPS.InitBlocks;

public class Demo2 {

	public static void main(String[] args) {
		new C();
		new D();
	}

}
class C{
	C(){
		System.out.println("C-Constructor");
	}
	C(int i){
		System.out.println("C-Constructor with integer parameter");
	}
	static {
		System.out.println("C-static");
	}
	{
		System.out.println("C-non-static");
	}
	{
		System.out.println("C-non-static 2");
	}
}
class D extends C{
	D(){
		System.out.println("D-Constructor");
	}
	D(int i){
		System.out.println("D-Constructor with integer parameter");
	}
	static {
		System.out.println("D-static");
	}
	{
		System.out.println("D-non-static");
	}
	{
		System.out.println("D-non-static 2");
	}
}
