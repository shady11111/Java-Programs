package com.example.OOPS.Constructor;

public class NumberOfObjectsCreated {

	public static void main(String[] args) {
		new H(5);
		System.out.println("Number of objects created: " + H.getObjectCount());
		
//		Output:
//			H() is called
//			H(int i) is called
//			Number of objects created: 1
	}
}
class H{
	private static int objectCount = 0;
	H(){
		objectCount++;
		System.out.println("H() is called");
	}
	H(int i){
		this();
		System.out.println("H(int i) is called");
	}
	public static int getObjectCount() {
        return objectCount;
    }
}
