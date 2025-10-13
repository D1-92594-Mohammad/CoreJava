package com.sunbeam;

public class Circle {

	private double myX;
	private double myY;
	private double myDiameter;
	public Circle() {
		this.myX = 0;
		this.myY = 0;
		this.myDiameter = 100;
	}
	public Circle(double myX, double myY) {	
		this.myX = myX;
		this.myY = myY;
	}
	public double getMyX() {
		return myX;
	}
	public void setMyX(double myX) {
		this.myX = myX;
	}
	public double getMyY() {
		return myY;
	}
	public void setMyY(double myY) {
		this.myY = myY;
	}
	public double getMyDiameter() {
		return myDiameter;
	}
	public void setMyDiameter(double myDiameter) {
		try {
			if(myDiameter < 0)
				throw new ExceptionDiameterIsNegative("Diameter is negative");
			else this.myDiameter = myDiameter;
		}
		catch(ExceptionDiameterIsNegative e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
