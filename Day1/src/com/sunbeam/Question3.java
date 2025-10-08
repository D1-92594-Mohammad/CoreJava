package com.sunbeam;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		int bill = 0;
		int choice;
		while(true) {
			choice = choice();
			switch (choice) {
			case 1: {
				bill+= 50;
				System.out.println("Dosa Added");
				break;
			}
			case 2: {
				bill += 20;
				System.out.println("Samosa Added");
				break;
			}
			case 3: {
				bill += 30;
				System.out.println("Idli Added");
				break;
			}
			case 4: {
				System.out.println("Bill: " +bill);
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
		
		
		
		

	}
	public static int choice() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("1. Dosa - 50rs");
		System.out.println("2. Samosa - 20rs");
		System.out.println("3. Idli - 30rs");
		System.out.println("4. Calculate Bill");
		System.out.print("Enter Choice: ");
		choice = sc.nextInt();
		
		return choice;
	}

}
