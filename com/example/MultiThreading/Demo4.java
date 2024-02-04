package com.example.MultiThreading;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		T2 t=new T2();
		t.start();
		for(int i=1;i<=10;i++)
			System.out.println((char)i+" Main");
		t.join(); // Wait for thread t to finish before proceeding
		// synchronizing the main thread's execution with the T2 thread's sleep
	}
}
class T2 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++)
			if(i==5)
				System.out.println(i+" Thread");
		try { 
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}		
	}
}