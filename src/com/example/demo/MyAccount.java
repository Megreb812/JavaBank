package com.example.demo;

public class MyAccount {

	private double balance;
	private String name;
	
	public MyAccount(String name, double startBalance) {
		this.name = name;
		this.balance = startBalance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void getBalance() {
		System.out.println("Balance of " + this.name + " is: " + this.balance);
	}
	
	public void deposit(double money) {
		this.balance += money;
	}
	
	public void withdraw(double money) {
		if(this.balance - money > 0) {
			this.balance -= money;	
		} else {
			System.out.println("Not enough money, get a job you bum");
		}
	}
	
}