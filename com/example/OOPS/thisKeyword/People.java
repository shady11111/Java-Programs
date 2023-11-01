package com.example.OOPS.thisKeyword;
//"this" can be used to Refer to Current Object:
public class People {

	public static void main(String[] args) {
		Person p1=new Person("A");
		Person p2=new Person("B");
		p1.introduce();
		p2.introduce();
	}

}
class Person{
	String name;
	Person(String name){
		this.name=name;
	}
	void introduce() {
		System.out.println("Hi!!! My name is "+name);
	}
}
