package com.example.OOPS.Interface;

public class Tag {
//Tag Interface
	public static void main(String[] args) {
		Washer washer=new Washer();
		washer.wash(new Phone());
		washer.wash(new Utensil());
	}
}
interface Washable{
	
}
class Utensil implements Washable{

	@Override
	public String toString() {		
		return this.getClass().getSimpleName();
	}
	
}
class Phone{
	@Override
	public String toString(){
		return "Phone";
	}
}
class Washer{
	void wash(Object object) {
		if(!(object instanceof Washable)) {
			System.out.println(object+ " is not washable");
			return;
		}
		System.out.println(object+" has been washed");
	}
}