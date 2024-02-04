package com.example.OOPS.Polymorphism;

public class Demo {

	public static void main(String[] args) {
		Base b=new Base();
		b.display();//i=0 j=0				
		b.input(10, 20);
		b.display();//i=10 j=20
		Derived d=new Derived();
		d.display();
		//i=0 j=0
		//k=0
		d.input(30, 40);
		d.display();
		//i=30 j=40
		//k=0
		d.input(50);
		d.display();
		//i=30 j=40
		//k=50
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
