package com.app.tester;
import com.app.geometry.*;

import java.util.Scanner;


public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter p1 co-ordinates");
		System.out.print("Enter x co-ordinate: ");
		int p_x1 = sc.nextInt();
		System.out.print("Enter y co-ordinate: ");
		int p_y1 = sc.nextInt();
		
		Point2d p1 = new Point2d(p_x1,p_y1);
		
		System.out.println("Enter p2 co-ordinates");
		System.out.print("Enter x co-ordinate: ");
		int p_x2 = sc.nextInt();
		System.out.print("Enter y co-ordinate: ");
		int p_y2 = sc.nextInt();
		Point2d p2 = new Point2d(p_x2,p_y2);
		
		
		
		
		System.out.print(p1.getDetails());
		System.out.println(p2.getDetails());
		
		boolean equal = p1.isEqual(p2);
		if(equal) {
			System.out.println("Points are located at same position");
		}
		else {
			int distance = p1.calculateDistance(p2);
			System.out.println("Distance between p1 and p2: " +distance);
		}
		
		
		

	}

}
