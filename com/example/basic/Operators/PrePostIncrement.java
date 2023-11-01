package com.example.basic.Operators;

public class PrePostIncrement {

	public static void main(String[] args) {
		//Pre Increament
				int a=0;
				
				int b=++a+8;
				System.out.println(a);//1
				System.out.println(b);//9
				
				int c=++b;
				System.out.println(c);//10
				
				//Post Increment
				int d=0;
				int e=d++;
				e=d+++e;//b=a++ + b;
				System.out.println(e);//1
				int f=e++;
				
				System.out.println(d);//2
				System.out.println(e);//2
				System.out.println(f);//1
				
				//Pre and Post Increment
				f=e++ + ++e;
				System.out.println(f);//6		
				
				f=++e + e++ + ++e;
				System.out.println(f);//17
				
				int g=0;
				g=g++;
				System.out.println(g);//0 0->1->0
				
				g=++g;
				System.out.println(g);//1 0->1->1
				
				System.out.println(g++);//1 1->1->2

				System.out.println(g++);//2 2->3
				
				System.out.println(++g);//4 3->4
				
	}

}
