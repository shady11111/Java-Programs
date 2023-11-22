package com.example.OOPS.Object;

public class Circle {
	int radius;
	Circle(){
		
	}
	Circle(int r){
		radius=r;
	}
	@Override
	public String toString() {
		return "radius is "+ radius;
	}
	@Override
	public boolean equals(Object arg){
		if(!(arg instanceof Circle))return false;
		return this.radius==((Circle)arg).radius;
	}
}
