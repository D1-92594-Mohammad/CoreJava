package com.sunbeam;

public class Test {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1.getMyDiameter());
		System.out.println(c1.getMyX());
		c1.setMyDiameter(-12);
		System.out.println(c1.getMyDiameter());

	}

}
