package com.example.OOPS.Object;

public class Rectangle {
	int breadth, length;
	Rectangle(int b, int l){
		breadth=b;
		length=l;
	}
	@Override
	public String toString() {
		return "length ="+length+" and breadth ="+breadth;
	}
	@Override
	public boolean equals(Object arg) {
		if(!(arg instanceof Rectangle))return false;
		return this.breadth==((Rectangle)arg).breadth && this.length==((Rectangle)arg).length;
	}
}
