package com.example.MultiThreading;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		T t=new T("aight");
		P.m("okay");
		t.start();
		P.m("okay");
	}
}
class P{
	public static synchronized void m(String string) {
		for(int i=1;i<=5;i++) {
			System.out.println("Exceuting "+string);
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
			}
		}
	}
}
class T extends Thread{
	String string;
	T(String string){
		this.string=string;
	}
	public void run() {
        P.m(string);
    }
}