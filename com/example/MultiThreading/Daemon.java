package com.example.MultiThreading;

public class Daemon {

	public static void main(String[] args) {
		NormalThread thread=new NormalThread();
		// Set daemon status before starting the thread
        thread.setDaemon(true);
//Setting normal thread as a daemon thread, before starting it causes it to behave as a daemon thread.
//Therefore, when the main() method exits, the JVM terminates the program even though the daemon thread may still be running.

//Setting a normal thread as a daemon thread allows it to behave similarly to daemon threads,
//meaning it won't prevent the JVM from exiting if it's the only thread running, and it may be terminated by the JVM when the program exits.
		thread.start();
		System.out.println(thread.isDaemon());
		System.out.println(Thread.currentThread().isDaemon());
//		Thread.currentThread().setDaemon(true); //Exception //would result in an IllegalThreadStateException because you cannot change the daemon status of the main thread after it has started.
//Once a thread has started, you cannot change its daemon status.
//Daemon thread's lifecycle is tied to the lifecycle of the entire application, not just to the presence of other threads.
	}
}
class NormalThread extends Thread{
	public void run() {
	}
}