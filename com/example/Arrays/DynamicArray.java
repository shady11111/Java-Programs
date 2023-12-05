package com.example.Arrays;

public class DynamicArray {
	private Object[] a=new Object[5];
	private int p=0;
//	private int p=-1;
	
	public void add(Object o) {
		if(p>=a.length) {
//			array expansion
			Object[] temp=new Object[a.length+2];
			System.arraycopy(a, 0, temp, 0, a.length);
			a=temp;
		}
		a[p++]=o;
//		a[++p]=o;		
	}	
	public void printElements() {
        for (int i = 0; i < p; i++) {
            System.out.println(a[i]);
        }
    }
	public static void main(String[] args) {
		DynamicArray object=new DynamicArray();
		
		object.add("Element 1");
		object.add("Element 2");
		object.add("Element 3");
		object.add("Element 4");
		object.add("Element 5");
		object.add("Element 6"); // This will trigger array expansion

		object.printElements();
	}
}