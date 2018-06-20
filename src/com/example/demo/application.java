package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		Scanner sc = new Scanner(System.in);
		// MyAccount account = new MyAccount("checking",1000);
		ArrayList<MyAccount> accounts = new ArrayList<MyAccount>();
		accounts.add(new MyAccount("Checking", 1000));
		accounts.add(new MyAccount("Credit Card", 800));
		accounts.add(new MyAccount("Savings", 8000));
		accounts.add(new MyAccount("HSA", 500));

		int currentAccount = 0;

		int choice = 0;
		while (choice != 9) {
			System.out.print("choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				// System.out.println("balance");
				accounts.get(currentAccount).getBalance();
				break;
			case 2:
				// System.out.println("deposit");
				System.out.println("Enter amount to deposit:");
				double money = sc.nextDouble();
				accounts.get(currentAccount).deposit(money);
				break;
			case 3:
				// System.out.println("withdraw");
				System.out.println("Enter amount to withdraw:");
				double moneyOut = sc.nextDouble();
				accounts.get(currentAccount).withdraw(moneyOut);
				break;
			case 4:
				for(int i = 0; i < accounts.size(); i++) {
					System.out.println(i+") " + accounts.get(i).getName());
				}
				System.out.print("account:");
				currentAccount = sc.nextInt();
				break;
			case 9:
				System.out.println("bye");
				break;
			default:
				System.out.println("Not recognized");
				break;
			}
		}
		sc.close();
	}

	public static void menu() {
		System.out.println("Great Bank of Ammon");
		System.out.println("-------------------");
		System.out.println("1) check balance");
		System.out.println("2) deposit");
		System.out.println("3) withdraw");
		System.out.println("4) switch account");
		System.out.println("9) exit");
	}

}