package com.example.OOPS.Interface;

public class Demo7 {

	public static void main(String[] args) {
		M m=new E();
		m.show();
		m.config();
		
		O o=new E();
		o.run();
	}
}
interface M{
	void show();
	void config();
}
interface N{
	void run();
}
interface O extends N{	
}
class E implements M,O{
	public void show() {
		System.out.println("in show");
	}
	public void config() {
		System.out.println("in config");
	}
	public void run() {
		System.out.println("in run");
	}
}