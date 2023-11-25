package com.example.Array;

public class Demo4 {

	public static void main(String[] args) {
		A[] a=new A[3];
		a[0]=new A(10);
		a[1]=new A(20);
		a[2]=new A(30);
		
		for(A reference:a) {
			System.out.println(reference);
//if a[0] is not initialized, reference i.e, address=null
			reference.m();
//if address is null, no address tries to call m() method, hence null pointer exception is thrown
		}
	}

}
class A{
	int i;
	A(int i){
		this.i=i;
	}
	void m() {
		System.out.println(i);
	}
}