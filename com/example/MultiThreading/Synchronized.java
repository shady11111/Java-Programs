package com.example.MultiThreading;

public class Synchronized {

	public static void main(String[] args) throws InterruptedException {
		Counter c=new Counter();
		
		Runnable r1=()->
		{
			for(int i=1;i<=10000;i++) {
				c.countIncrement();
			}
		};
		Runnable r2=()->
		{
			for(int i=1;i<=10000;i++) {
				c.countIncrement();
			}
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();

//By using t1.join() and t2.join(), the main thread will wait for t1 and t2 to complete before printing the value of c.count.
//This should give you a more accurate result.		
		t1.join();
		t2.join();
		
		System.out.println(c.count);
	}
}
class Counter{
	int count;
//if synchronized not used, then count of both threads might happen at the same time and might lose few counts
	public synchronized void countIncrement() {
		count++;
	}
}