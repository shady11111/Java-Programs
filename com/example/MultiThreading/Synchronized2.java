package com.example.MultiThreading;

public class Synchronized2 {

	public static void main(String[] args) {
		M m1=new M();
		M m2=new M();
		N n1=new N(m1, "N1");
		N n2=new N(m2, "N2");
		n1.start();
		System.out.println();
		n2.start();
	}
}
class M{
	public static synchronized void m1(String s) {
		for(int i=1;i<=5;i++) {
			System.out.println("Executed by "+s);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
			}
		}
	}
}
class N extends Thread{
	M m;
	String s;
	public N(M m, String s){
		this.m=m;
		this.s=s;
	}
	@Override
	public void run() {
		M.m1("m");
	}
}