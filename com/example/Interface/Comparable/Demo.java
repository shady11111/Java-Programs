package com.example.Interface.Comparable;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		Circle[] array= {new Circle(10),new Circle(5), new Circle(80)};
		Arrays.sort(array);
//Arrays.sort implementation
//public static void sort(Object[] array) {
//	for(int i=0;i<a.length-1-i;i++) {
//		for(int j=0;j<a.length-1-i;j++) {
//			Comparable c1=(Comparable)a[j];
//			Comparable c2=(Comparable)a[j+1];
//			if(c1.compareTo(c2)>0)
//				swap() / comparision method
//		}
//	}
//}
		for(Circle circle:array)
			System.out.println(circle);
	}
}
class Circle implements Comparable<Object>{
	int radius;
	Circle(int radius){
		this.radius=radius;
	}
	public int compareTo(Object object) {
		
//		if(this.radius>((Circle)object).radius)return 1;
//		else if(this.radius<((Circle)object).radius)return -1;
//		else return 0;
		
		return radius-((Circle)object).radius;
	}
	public String toString() {
		return "[Circle:radius="+radius+"]";
	}
}