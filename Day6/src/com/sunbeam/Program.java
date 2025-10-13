package com.sunbeam;

import java.util.Scanner;

class ExceptionLineTooLong extends Throwable{
	private String message;

	public ExceptionLineTooLong() {
		
	}

	public ExceptionLineTooLong(String message) {

		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}



public class Program {
	public static int inputString(String str) throws ExceptionLineTooLong {
		if(str.length() > 5) {
			throw new ExceptionLineTooLong("The string is too long...");
		}
		else return str.length();
		
	}

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter string: ");
			String str = sc.nextLine();
			int res = inputString(str);
			System.out.println("Length of string: " +res);
		}
		catch(ExceptionLineTooLong e) {
			System.out.println("Error: " +e.getMessage());
		}
	}

}
