package com.example.OOPS.InnerClass;

public class Anonymous {

	public static void main(String[] args) {
		B b=new B()
		{
			public void show() {
				System.out.println("in inner anonymous show()");
			}
		};
		b.show();
	}

}
class B{
	public void show() {
		System.out.println("in show B");
	}
}