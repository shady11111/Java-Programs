package com.example.MultiThreading;

public class Demo2 {

	public static void main(String[] args) {
		Runnable x=()->
		{
			for(int i=1;i<=10;i++) {
				System.out.println("in X");
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		Runnable y=()->
		{
			for(int i=1;i<=10;i++) {
				System.out.println("in Y");
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		};
//		x.run();
//		y.run();
//the code inside the run() methods of x and y will be executed sequentially on the main thread, not concurrently.
//So, first, the code inside the run() method of x will run until completion, then the code inside the run() method of y will run.		
		Thread t1=new Thread(x);
		Thread t2=new Thread(y);
		
		t1.start();
		t2.start();
	}
}

//class X implements Runnable{
//	public void run() {
//		for(int i=1;i<=10;i++) {
//			System.out.println("in X");
//			try {
//				Thread.sleep(100);
//			}
//			catch(InterruptedException e){
//				e.printStackTrace();
//			}
//		}
//	}
//}
//class Y implements Runnable{
//	public void run() {
//		for(int i=1;i<=10;i++) {
//			System.out.println("in Y");
//			try {
//				Thread.sleep(100);
//			}
//			catch(InterruptedException e){
//				e.printStackTrace();
//			}
//		}
//	}
//}