package com.example.OOPS.Interface;

public class Demo6 {

	public static void main(String[] args) {
		P p=new Z();
		p.show();
		p.config();
		Q q=new Z();
		q.run();
	}
}
interface P{
	void show();
	void config();
}
interface Q{
	void run();
}

class Z implements P,Q{
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