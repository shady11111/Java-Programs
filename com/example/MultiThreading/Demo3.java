package com.example.MultiThreading;

public class Demo3 {

	public static void main(String[] args) {
		T1 t=new T1();
		t.start();
		for(int i=1;i<=10;i++)
			System.out.println((char)i+" Main");
	}
}
class T1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println(i+" Thread");
	}
}