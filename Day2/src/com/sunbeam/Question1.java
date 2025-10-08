package com.sunbeam;

import java.util.Scanner;

class Invoice{
	private String part_number;
	private String part_description;
	private int quantity;
	private double price_per_item;
	
	public Invoice(String part_number, String part_description,int quantity,double price_per_item) {
		this.part_number = part_number;
		this.part_description = part_description;
		this.quantity = quantity;
		this.price_per_item = price_per_item;
	}
	public void displayRecord() {
		System.out.println("Part Number: " +part_number);
		System.out.println("Part description: " +part_description);
		System.out.println("Quantity: " +quantity);
		System.out.println("Price per item: " +price_per_item);
	}
	//setters
	public void setPartNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Part Number: ");
		part_number = sc.next();
	}
	public void setPartDescription() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Part Description: ");
		part_description = sc.nextLine();
	}
	public void setQuantity(int quantity) {
		if(quantity < 0)
			this.quantity = 0;
		else 
			this.quantity = quantity;
		
	}
	public void setPrice_per_item(double price_per_item) {
		if(price_per_item < 0)
			this.price_per_item = 0.0;
		else
			this.price_per_item = price_per_item;
	}
	//Getters
	public String getPartNumber() {
		return this.part_number;
	}
	public String getPartDescription() {
		return this.part_description;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice_per_item() {
		return price_per_item;
	}
	
	//Methods
	public void calculateInvoice() {
		double invoice = (double) quantity*price_per_item;
		System.out.print("Invoice: "+invoice);
	}
	
	
	
}

public class Question1 {

	public static void main(String[] args) {
		Invoice i = new Invoice("212","Lorem10",10,100);
		i.displayRecord();
		i.setPartNumber();
		i.displayRecord();
		i.setQuantity(20);
		i.displayRecord();
		i.calculateInvoice();
		i.setPrice_per_item(-20);
		i.displayRecord();
		
	}

}
