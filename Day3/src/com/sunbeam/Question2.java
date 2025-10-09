package com.sunbeam;

class Customer{
	private int acc_no;
	private int balance;
	private int total_charges;
	private int credits;
	
	public Customer(int acc_no,int balance,int total_charges,int credits) {
		this.acc_no = acc_no;
		this.balance = balance;
		this.total_charges = total_charges;
		this.credits = credits;
	}
	public void CalculateCredits() {
		int new_balance = balance + total_charges - credits;
		
		if(new_balance < credits) {
			System.out.println("Credit limit exceeded");
		}
		else {
			System.out.println("New balance: " +new_balance);
		}
	}
}

public class Question2 {

	public static void main(String[] args) {
		Customer c = new Customer(1,2000,1000,500);
		c.CalculateCredits();

	}

}
