package com.example.MultiThreading;

public class Deposit {

	public static void main(String[] args) throws InterruptedException {
		Account account=new Account();
		new DepositThread(account, 10000);
		new DepositThread(account, 20000);
		Thread.sleep(3000);
		System.out.println(account.getBalance());
	}
}
class DepositThread extends Thread{
	Account account;
	int amount;
	public DepositThread(Account account, int amount) {
		this.account=account;
		this.amount=amount;
//		new Thread(this).start();
		this.start();
	}
	public void run() {
		try {
			account.deposit(amount);
			System.out.println("Deposit done");
		}
		catch(InterruptedException e) {
		}
	}
}
class Account{
	private int balance;
	public synchronized void deposit(int amount) throws InterruptedException{
		int newBalance=balance+amount;
		Thread.sleep(500);
		balance=newBalance;
	}
	public int getBalance() {
		return balance;
	}
}