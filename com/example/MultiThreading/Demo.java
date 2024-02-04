package com.example.MultiThreading;

public class Demo {

	public static void main(String[] args) {
		A a = new A();
		B b= new B();
		
		System.out.println(a.getPriority() +" "+ b.getPriority());//5 5	
		b.setPriority(2);
		System.out.println(b.getPriority());//2
		b.setPriority(Thread.MAX_PRIORITY);
		System.out.println(b.getPriority());//10
		b.setPriority(Thread.MIN_PRIORITY);
		System.out.println(b.getPriority());//1
		b.setPriority(Thread.NORM_PRIORITY);
		System.out.println(b.getPriority());//5
		System.out.println();
		
		a.start();
		
		try {
            Thread.sleep(5000);//milliseconds
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
				Thread.sleep(1000);
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
				 Thread.sleep(1000);
	         }
			 catch (InterruptedException e) {
				 throw new RuntimeException(e);
			 }
		}
	}
}