package com.example.MultiThreading;

public class Daemon2 {

	public static void main(String[] args) {
		NormalThread2 thread=new NormalThread2();
		// Set daemon status before starting the thread
        thread.setDaemon(true);
		thread.start();
		
		for(int i=1;i<=5;i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}			
	}
}
class NormalThread2 extends Thread{
	public void run() {
		for(char ch='k';ch<='z';ch++) {
			System.out.print(ch+" ");
		}
		System.out.println();
	}
}