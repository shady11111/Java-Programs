package com.example.OOPS.Constructor;

public class Usingthis {

	public static void main(String[] args) {
		E e1=new E(5);
		E e2=new E(98,75);
		System.out.println(e1.i);//5
		System.out.println(e2.i);//98
		System.out.println(e2.j);//0
	}

}
class E{
	int i;
	int j;
	E(int x){
		i=x;
	}
	E(int i, int j){
		this(j);//this.i=75
		this.i=i;//this.i=98
	}
}