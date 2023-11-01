package com.example.OOPS.thisKeyword;
//"this" can be used to Invoke Another Constructor:
public class Students {

	public static void main(String[] args) {
		Student s1=new Student("A",46);
		Student s2=new Student("B");
		Student s3=new Student();
		s1.display();
		s2.display();
		s3.display();
	}

}

class Student{
	String name;
	int score;
	Student(){
		this("Unknown",0);
	}
	Student(String name){
		this(name,0);
	}
	Student(String name, int marks){
		this.name=name;
		this.score=marks;
	}
	void display() {
		System.out.println("Student's name is: "+ name+" and the score is "+ score);
	}
}
