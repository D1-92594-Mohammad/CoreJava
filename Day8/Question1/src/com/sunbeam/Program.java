package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static List<Book> books = new ArrayList<>();
	private static int menuList() {
		
		System.out.println("Enter choice");
		System.out.println("0. Exit");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Display all books in reverse order");
		System.out.println("4. Delete a book at given index");
		System.out.println("5. Sort all books by price in desc order");
		System.out.print("Enter choice: ");
		return sc.nextInt();
	}
	public static void addBook() {
		System.out.println("Follow steps to add the book");
		System.out.print("Enter isbn number: ");
		String isbn = sc.next();
		sc.nextLine();
		System.out.print("Enter Author name: ");
		String authorName = sc.nextLine();
		System.out.print("Enter Price: ");
		double price = sc.nextDouble();
		System.out.print("Enter quantity: ");
		int quantity = sc.nextInt();
		books.add(new Book(isbn,price,authorName,quantity));
	}
	
	public static void DisplayAllBooksInForwardOrder() {
		for(Book bk : books) {
			System.out.println(bk.toString());
		}
	}
	public static void DisplayBooksInReverseOrder() {
		ListIterator<Book> itr = books.listIterator(books.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous().toString());
		}
	}
	public static void sortByPriceDesc() {
		Collections.sort(books);
	}
	public static void deleteBookAtIndex(int indexToDelete) {
		if(indexToDelete >= 0 && indexToDelete < books.size()) {
			books.remove(indexToDelete);
			
		}
		else {
			System.out.println("Invalid index. Please try again.");
		}
		
	}
	
	public static void main(String[] args) {
		Collections.addAll(books, 
				new Book("1",434,"Khaled Hosseini",10),
				new Book("2",250,"JK Rowling",30),
				new Book("3",387,"Tolkien",20),
				new Book("4",309,"George RR Martin",15));
		
		int choice;
		while((choice = menuList())!= 0) {
			switch (choice) {
			case 1: {
				addBook();
				break;
			}
			case 2: {
				DisplayAllBooksInForwardOrder();
				break;
			}
			case 3: {
				DisplayBooksInReverseOrder();
				break;
			}
			case 4: {
				System.out.println("Enter the index of the book you want to delete: ");
				int indexToDelete = sc.nextInt();
				deleteBookAtIndex(indexToDelete);
				break;
			}
			case 5: {
				sortByPriceDesc();
				break;
			}
			default:
				break;
			}
		}
	}

}
