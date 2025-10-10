package com.app.fruits;

public abstract class Fruit {
	String color;
	double weight;
	String name;
	boolean isFresh;
	public Fruit() {
		//Parameterless ctor
	}
	public Fruit(String color, double weight, String name, boolean isFresh) {
		
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	@Override
	public String toString() {
		return "Name: " + this.name + "weight: " + this.weight + "Color: " + this.color ;
	}
	public abstract String taste();
	public abstract String getName();
	public abstract boolean isFresh();
	public void setFresh() {
		this.isFresh = false;
	}
	}
	
