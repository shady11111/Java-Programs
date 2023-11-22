package com.example.MultiThreading;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		T2 t=new T2();
		t.start();
		for(int i=1;i<=10;i++)
			System.out.println((char)i+" Main");
		Thread.sleep(500); //main thread is sleeping for 500 milliseconds.
//the main method is executed by the main thread,
//and the Thread.sleep(100) in the main method will make the main thread sleep
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