package com.example.MultiThreading;

public class Demo5 {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2.thread2=new Thread2();
		Thread2.thread2.start();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=3;i++)
			System.out.println("Main");
		
	}
}
class Thread1 extends Thread{
	@Override
	public void run(){
		try {
			Thread2.thread2.join();
		}
		catch(InterruptedException e) {
			
		}
		for(int i=1;i<=3;i++)
			System.out.println("Thread1");
	}
}
class Thread2 extends Thread{
	static Thread2 thread2;
	@Override
	public void run(){
		for(int i=1;i<=3;i++)
			System.out.println("Thread2");
	}
}