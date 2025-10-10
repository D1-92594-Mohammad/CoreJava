package com.app.fruits;

public class Orange extends Fruit {
	
	public Orange() {
		
	}
	public Orange(String color,double weight,String name,boolean isFresh) {
		super(color,weight,name,isFresh);
	}
	@Override
	public String toString() {
		return "Name: " + this.name + "weight: " + this.weight + "Color: " + this.color ;
	}
	public String getName() {
		return this.name;
	}
	public String taste() {
		return "Sour";
	}
	public boolean isFresh() {
		return this.isFresh;
	}

}
