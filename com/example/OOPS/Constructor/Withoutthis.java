package com.example.OOPS.Constructor;

public class Withoutthis {

	public static void main(String[] args) {
		D d1=new D(5);
		System.out.println(d1.i);//0
		System.out.println(d1.j);//5
		D d2=new D(6,8);
		System.out.println(d2.i);//6
		System.out.println(d2.j);//0
	}

}
class D{
	int i;
	int j;
	D(int j){
		this.j=j;
	}
	D(int i, int j){
		new D(j);//this is creating altogether new object and is initializing variable from first constructor
		this.i=i;
	}
}
