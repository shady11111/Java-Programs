package com.example.OOPS.Polymorphism;

public class Demo {

	public static void main(String[] args) {
		Base b=new Base();
		b.display();
		b.input(10, 20);
		b.display();
		Derived d=new Derived();
		d.display();
		d.input(30, 40);
		d.display();
		d.input(50);
		d.display();
	}
}
class Base{
	int i, j;
	void input(int i, int j){
		this.i=i;
		this.j=j;
	}
	void display() {
		System.out.println("i="+i+" j="+j);
	}
}
class Derived extends Base{
	int k;
	void input(int k) {
		this.k=k;
	}
	void display() {
		super.display();
		System.out.println("k="+k);
	}
}
