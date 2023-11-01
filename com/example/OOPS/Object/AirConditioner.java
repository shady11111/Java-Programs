package com.example.OOPS.Object;

public class AirConditioner {

	public static void main(String[] args) {
		AC a1=new AC();
		a1.decreaseTemperature();
		a1.switchOn();
		a1.decreaseTemperature();
		a1.increaseTemperature();
		a1.increaseTemperature();
		a1.switchOff();
	}

}
class AC{
	int temp;
	boolean on=false;
	
	void switchOn() {
		on=true;
		temp=23;
		System.out.println("AC is on and is at a temperature of "+temp+" degree celsius.");
	}
	
	void switchOff() {
		on=false;
		temp=0;
		System.out.println("AC is switched off");
	}
	
	void increaseTemperature(){
		if(!on) {
			System.out.println("Please turn on the AC");
			return;
		}
		++temp;
		System.out.println("AC is at a temperature of "+temp+" degree celsius.");
	}
	
	void decreaseTemperature() {
		if(!on) {
			System.out.println("Please turn on the AC");
			return;
		}
		temp--;
		System.out.println("AC is at a temperature of "+temp+" degree celsius.");
	}
}

