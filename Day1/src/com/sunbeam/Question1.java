package com.sunbeam;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		Integer number = num;
		
		String binary = Integer.toBinaryString(number);
		String octal = Integer.toOctalString(number);
		String hex = Integer.toHexString(number);
		
		System.out.println("Binary: "+binary);
		System.out.println("Octal: "+octal);
		System.out.println("Hexadecimal: "+hex);

	}

}
