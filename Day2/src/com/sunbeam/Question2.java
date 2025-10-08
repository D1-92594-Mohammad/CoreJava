package com.sunbeam;

import java.util.Scanner;

class Employee {
	private String first_name;
	private String last_name;
	private double salary;
	public Employee(String first_name, String last_name, double salary) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}
	
	public void displayRecord() {
		System.out.println("First Name: " +first_name);
		System.out.println("Last Name: " +last_name);
		System.out.println("Salary: " +salary);
	}
	
	public void setFirst_name(String first_name) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		this.first_name = sc.next();
	}
	public void setLast_name() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name: ");
		this.last_name = sc.next();
	}
	public void setSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary: ");
		double temp = sc.nextDouble();
		if(temp > 0)
			this.salary = temp;
		
	}
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void calcYearlySalary() {
		System.out.println("yearly salary: "+this.salary*12);
	}
	 public void giveRaise() {
		 System.out.println("Calculating raise: ");
		 this.salary += this.salary*0.1;
	 }
}

public class Question2 {

	public static void main(String[] args) {
		EmployeeTest();
		
	}
	public static void EmployeeTest() {
		Employee e1 = new Employee("Hakim","Lukka",3000);
		Employee e2 = new Employee("Ibu","Hatela",4000);
		e1.calcYearlySalary();
		e2.calcYearlySalary();
		e1.giveRaise();
		e2.giveRaise();
		e1.calcYearlySalary();
		e2.calcYearlySalary();
	}
}


