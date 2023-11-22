package com.example.OOPS.Exception;

public class DuckingException {
	static {
		System.out.println("DuckingException class loaded");
	}
	public static void main(String[] args) {
		CheckClass checkClass=new CheckClass();
		try {
			checkClass.show();
		}
		catch(ClassNotFoundException exception) {
			exception.printStackTrace();
		}
	}
}
class CheckClass{
	public void show() throws ClassNotFoundException {
		Class.forName("com.example.OOPS.Exception.Demo5");
		System.out.println("Demo5 loaded");
		Class.forName("com.example.OOPS.Exception.Demo6");
		System.out.println("Demo6 loaded");
	}
}