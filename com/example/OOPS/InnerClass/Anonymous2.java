package com.example.OOPS.InnerClass;

public class Anonymous2 {

	public static void main(String[] args) {
		M m=new M() {
			@Override
			public void show(){
				System.out.println("in show");
			}
			@Override
			public void config() {
				System.out.println("in config");
			}
		};
		m.show();
		m.config();
	}

}
abstract class M{
	public abstract void show();
	abstract void config();
}
