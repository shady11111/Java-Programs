package com.example.MultiThreading;

public class Daemon {

	public static void main(String[] args) {
		NormalThread thread=new NormalThread();
		// Set daemon status before starting the thread
        thread.setDaemon(true);
		thread.start();
		System.out.println(thread.isDaemon());
		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true); //Exception
	}
}
class NormalThread extends Thread{
	public void run() {
	}
}