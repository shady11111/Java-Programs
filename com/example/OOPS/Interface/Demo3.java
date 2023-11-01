package com.example.OOPS.Interface;

public class Demo3 {

	public static void main(String[] args) {
		Switch s=new LED();
		s.on();
	}
}
interface Switch {
	void on();
	void off();
}
class LED implements Switch{
	@Override
	public void on() {
		System.out.println("LED glows");
	}
	@Override
	public void off() {
		System.out.println("LED blows");
	}
}