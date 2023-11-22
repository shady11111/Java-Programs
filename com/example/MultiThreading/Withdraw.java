package com.example.MultiThreading;

public class Withdraw {

	public static void main(String[] args) {
		AccountWithdraw accountWithdraw=new AccountWithdraw(6000);
		new Thread() {
			public void run() {
				accountWithdraw.withdraw(10000);
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					accountWithdraw.deposit(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
}
class AccountWithdraw{
	private int balance;
	AccountWithdraw(int balance){
		this.balance=balance;
	}
	public synchronized void withdraw(int amount) {
		if(amount>balance) {
			try {
				System.out.println("Less Balance...");
				wait();
			}
			catch (InterruptedException e) {
			}
		}
		balance-=amount;
		System.out.println("Withdraw done.");
		System.out.println(balance+" is the current balance");
	}
	public synchronized void deposit(int amount) throws InterruptedException{
		System.out.println("going to deposit...");
		balance+=amount;
		System.out.println("Deposit done.");
		notify();
	}
}