package com.example.OOPS.Interface;

public class Demo5 {

	public static void main(String[] args) {
		Developer developer1=new Developer();
		
		Laptop gadget1=new Laptop();		
		developer1.developApp(gadget1);
		
		Desktop gadget2=new Desktop();
		developer1.developApp(gadget2);
	}

}
class Developer{
//	public void developApp(Laptop gadget) {
//		System.out.println("coding...");
//		gadget.code();
//	}	
	public void developApp(Computer gadget) {
		gadget.code();
	}
}
class Laptop implements Computer{
	public void code() {
		System.out.println("code, compile, run");
	}
}
class Desktop implements Computer{
	public void code() {
		System.out.println("code, compile, run fast...");
	}
}
interface Computer{
	//helps in loose coupling
	void code();
}