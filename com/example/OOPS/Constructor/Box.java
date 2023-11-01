package com.example.OOPS.Constructor;

public class Box {

	public static void main(String[] args) {
		BoxDimension b1=new BoxDimension(10);
		System.out.println("Box b1 has length of "+b1.length+", breadth of "+b1.breadth+" and height of "+b1.height);
	}

}
class BoxDimension{
	int length;
	int breadth;
	int height;
	BoxDimension(int x, int y, int z) {
		length=x;
		breadth=y;
		height=z;
	}
	BoxDimension(int d){
		this(d, d, d);
	}
}
