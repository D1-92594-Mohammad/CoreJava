package com.app.geometry;

public class Point2d{
	private int x;
	private int y;
	public Point2d(int p1,int p2) {
		this.x =p1;
		this.y = p2;
	}
	public String getDetails() {
		return "X co-ordinate: " + this.x + " Y co-ordinate: " +this.y + "";
	}
	public boolean isEqual(Point2d obj) {
		if(this.x == obj.x && this.y == obj.y) return true;
		else return false;
	}
	public int calculateDistance(Point2d obj) {
		int deltaX = Math.abs(this.x - obj.x);
		int deltaY = Math.abs(this.y - obj.y);
				
		int distance = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
		return distance;
		
	}
}

