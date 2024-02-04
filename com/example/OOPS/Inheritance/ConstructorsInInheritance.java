package com.example.OOPS.Inheritance;

public class ConstructorsInInheritance {

	public static void main(String[] args) {
		Super sp=new Super(10,20);
		sp.display();//i=10 j=20
		Sub sb1=new Sub(50);
		sb1.display();
		//i=30 j=40
		//k=50
		Sub sb2=new Sub(60,70,80);
		sb2.display();
		//i=60 j=70
		//k=80
	}

}
class ParentSuper{
	ParentSuper(){}
	ParentSuper(String s){}
}
class Super extends ParentSuper{
	int i,j;
	Super(int i, int j){
		super();
		this.i=i;
		this.j=j;
	}
	void display() {
		System.out.println("i="+i+" j="+j);
	}
}
class Sub extends Super{
	int k;
	Sub(int k){
		super(30,40);//hard coded
		this.k=k;
	}
	Sub(int i, int j, int k){
		super(i,j);
		this.k=k;
	}
	void display() {
		super.display();
		System.out.println("k="+k);
	}
}