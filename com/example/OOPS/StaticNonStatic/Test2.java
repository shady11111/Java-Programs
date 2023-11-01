package com.example.OOPS.StaticNonStatic;

public class Test2 {

	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		A a3=new A();
		a1.increment();//0 and 0 post incrementing
		a2.increment();//0 and 1 post incrementing
		a3.increment();//0 and 2 post incrementing
		a1.display();//1 and 3
		a2.display();//1 and 3
		a3.display();//1 and 3
	}
}

