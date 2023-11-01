package com.example.OOPS.Overriding;

public class Demo2 {

	public static void main(String[] args) {
		SBI s=new SBI();
		System.out.println(s.rateOfInterest());
	}

}
class Bank{
	int rateOfInterest()
	{
		return 5;
	}
	
}
class SBI extends Bank{
	@Override
	int rateOfInterest()
	{
		return 10;
	}
}
