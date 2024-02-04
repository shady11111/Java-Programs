package com.example.OOPS.Constructor;

public class Demo {

	public static void main(String[] args) {
		F f1=new F(36);
		F f2=new F(54);
		G g1=new G();
		g1.m1(f1);
		g1.m1(f2);
		
//		Output:
//			36
//			6
//			54
//			6
	}

}
class F{
	int i;
	F(int i){
		this.i=i;
	}
}
class G{
	void m1(F f) {
		F f1=new F(6);
		System.out.println(f.i);
		System.out.println(f1.i);
	}
}