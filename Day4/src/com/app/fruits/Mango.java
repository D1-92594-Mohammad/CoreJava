package com.app.fruits;

public class Mango extends Fruit {
	public Mango() {
		//parameterless ctor
	}
	public Mango(String color,double weight,String name,boolean isFresh) {
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
		return "Sweet";
	}
	public boolean isFresh() {
		return this.isFresh;
	}
	
}
