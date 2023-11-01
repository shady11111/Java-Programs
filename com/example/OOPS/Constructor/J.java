package com.example.OOPS.Constructor;

public class J {

	public static void main(String[] args) {
		K k1=new K(10);
		K k2=new K(100);
		k1.display(k2);
		k1.display(k1);
	}

}
class K{
	int i;
	K(int i){
		this.i=i;
	}
	void display(K k) {
		System.out.println(i);
		System.out.println(k.i);
	}
}