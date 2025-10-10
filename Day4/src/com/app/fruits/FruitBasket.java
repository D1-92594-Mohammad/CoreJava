package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	public static Scanner sc = new Scanner(System.in);
	public static int cur_index = 0;
	public static int size;
	public static int i = 0;

	public static void main(String[] args) {
		System.out.println("Enter size of basket: ");
		size = sc.nextInt();
		Fruit[] basket = new Fruit[size]; 
		int choice;
		while((choice = getChoice()) !=0) {
			switch (choice) {
			case 1: {
				if(cur_index < size) {
					addMango(basket);
				}
				else {
					System.out.println("Limit exceeded");
					return;
				}
					
				break;
			}
			case 2: {
				if(cur_index < size) {
					addOrange(basket);
				}
				else {
					System.out.println("Limit exceeded");
					return;
				}
				break;
			}
			case 3: {
				if(cur_index < size) {
					addApple(basket);
				}
				else {
					System.out.println("Limit exceeded");
					return;
				}
				break;
			}
			case 4: {
				displayAll(basket);
				break;
			}
			case 5: {
				displayName(basket);
				break;
			}
			case 6: {
				displayTasteOfStaleFruit(basket);
				break;
			}
			case 7: {
				System.out.println("Enter index: ");
				int index = sc.nextInt();
				markFruitAsStale(basket,index);
				break;
			}
			case 8: {
				markSourFruitStale(basket);
				break;
			
			}
			}
		}
		

	}
	
	public static int getChoice() {
		
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		
		System.out.println("4. Display names of all fruits in basket");
		System.out.println("5. Get details");
		
		System.out.println("6. Display taste of stale fruits");
		System.out.println("7. Mark fruit as stale");
		System.out.println("8. Mark sour fruits stale");
		System.out.println("Enter choice: ");
		return sc.nextInt();
		}
	public static void addMango(Fruit[] basket) {
		if(cur_index < size) {
			basket[cur_index] = new Mango("Yellow",0.1,"Mango",true);
			System.out.println("Mango Added");
			cur_index++;
		}
		else System.out.println("Basket size exceeded.");
	}
	public static void addOrange(Fruit[] basket) {
		if(cur_index < size) {
			basket[cur_index] = new Orange("Orange",0.08,"Orange",true);
			System.out.println("Orange Added");
			cur_index++;
		}
		else System.out.println("Basket size exceeded.");
	}
	public static void addApple(Fruit[] basket) {
		if(cur_index < size) {
			basket[cur_index] = new Apple("Red",0.9,"Apple",true);
			System.out.println("Apple Added");
			cur_index++;
		}
		else System.out.println("Basket size exceeded.");
	}
	public static void displayAll(Fruit[] basket) {
		for(Fruit fruit : basket) {
			
			System.out.println("Name of fruit at index "+i +" is " +fruit.getName());
			i++;
		}
	}
	public static void displayName(Fruit[] basket) {
		for(Fruit fruit : basket) {
			String temp = fruit.toString();
			System.out.println(temp);
			if(fruit.isFresh()) System.out.println("Fresh");
		}
	}
	public static void displayTasteOfStaleFruit(Fruit[] basket) {
		for(Fruit fruit: basket) {
			if(!fruit.isFresh) System.out.println(fruit.taste());
				 
		}
	}
	public static void markFruitAsStale(Fruit[] basket,int index) {
		if(index < size) {
			basket[index].setFresh();
		}
		else System.out.println("Invalid index");
	}
	public static void markSourFruitStale(Fruit[] basket) {
		for(Fruit fruit : basket) {
			if(fruit.taste() == "Sour") {
				fruit.setFresh();
			}
		}
	}
	
}
