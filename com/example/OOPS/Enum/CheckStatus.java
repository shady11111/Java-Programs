package com.example.OOPS.Enum;

public class CheckStatus {

	public static void main(String[] args) {
		Status s=Status.Running;
		System.out.println(s.getClass());
		System.out.println(s.getClass().getSuperclass());
		switch(s) {
		case Failed:
			System.out.println("Failed.");
			break;
		case Pending:
			System.out.println("pending....");
			break;
		case Running:
			System.out.println("running....");
			break;
		default:
			System.out.println("Done.");
			break;
		}
	}
}