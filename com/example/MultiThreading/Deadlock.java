package com.example.MultiThreading;

public class Deadlock {

	public static void main(String[] args) {
		DeadlockThread thread=new DeadlockThread();
		thread.help();
	}
}
class DeadlockThread extends Thread{
	X x=new X();
	Y y=new Y();
	public void help() {
		this.start();
		y.m(x);
	}
	public void run() {
		x.m(y);
	}
//two threads (DeadlockThread and the main thread) holding locks on x and y, respectively,
//but they are waiting for the other resource to be released.
//DeadlockThread holds the lock on x and waits to acquire the lock on y.
//main thread holds the lock on y and waits to acquire the lock on x.
//At this point, both threads hold locks but are waiting for the other resource to be released, resulting in a deadlock. Neither thread can proceed
//test of x waiting for y lock
//test of y waiting for x lock
}
class X{
	public synchronized void m(Y y) {
		System.out.println("m-X()");
		y.test();
	}
	public synchronized void test() {
		System.out.println("Test X()");
	}
}
class Y{
	public synchronized void m(X x) {
		System.out.println("m-Y()");
		x.test();
	}
	public synchronized void test() {
		System.out.println("Test Y()");
	}
}