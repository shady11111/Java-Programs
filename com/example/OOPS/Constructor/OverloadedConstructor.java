package com.example.OOPS.Constructor;

public class OverloadedConstructor {

	public static void main(String[] args) {
		I i1=new I();
		I i2=new I(5);
		I i3=new I(5, true);
		System.out.println(i1.getValue());//0
		System.out.println(i2.getValue());//5
		System.out.println(i3.getValue());//10
	}

}
class I{
	private int value;
	I(){
		value=0;
	}
	I(int value){
		this.value=value;
	}
	I(int value, boolean doubleValue){
		if(doubleValue)
			this.value=2*value;
		else
			this.value=value;
	}
	
	public int getValue(){
		return value;
	}
}
