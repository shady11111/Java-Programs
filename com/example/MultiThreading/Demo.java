package com.example.MultiThreading;

public class Demo {

	public static void main(String[] args) {
		A a = new A();
		B b= new B();
		
		System.out.println(a.getPriority());
		System.out.println();
		
		System.out.println(b.getPriority());
		b.setPriority(2);
		System.out.println(b.getPriority());
		b.setPriority(Thread.MAX_PRIORITY);
		System.out.println(b.getPriority());//10
		b.setPriority(Thread.MIN_PRIORITY);
		System.out.println(b.getPriority());//1
		b.setPriority(Thread.NORM_PRIORITY);
		System.out.println(b.getPriority());//5
		
		a.start();
		
		try {
            Thread.sleep(5);//milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		b.start();
	}
}
class A extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("in A");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}		
	}
}
class B extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("in B");
			 try {
				 Thread.sleep(10);
	         }
			 catch (InterruptedException e) {
				 throw new RuntimeException(e);
			 }
		}
	}
}