package com.example.OOPS.Enum;

public class KnowStatus {

	public static void main(String[] args) {
		Status s=Status.Success;
		System.out.println(s.ordinal()+" : "+s.name());
		Status[] ss=Status.values();
		for(Status sEach:ss) {
			System.out.println(sEach+" : "+sEach.ordinal());
		}
	}
}
enum Status{
	Running, Failed, Pending, Success
}
