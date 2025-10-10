package com.app.fruits;

public class Apple extends Fruit {
	public Apple() {
		//ctor
	}
	public Apple(String color,double weight,String name,boolean isFresh) {
		super(color,weight,name,isFresh);
	}
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return "Name: " + this.name + "weight: " + this.weight + "Color: " + this.color ;
	}
	public String taste() {
		return "Sweet and Sour";
	}
	public boolean isFresh() {
		return this.isFresh;
	}
}
