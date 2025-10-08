package com.sunbeam;

class Date{
	private int day;
	private int month;
	private int year;
	public Date(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate() {
		System.out.print(day + "/" +month +"/" +year);
	}
}

public class Question3 {

	public static void main(String[] args) {
		DateTest();

	}
	
	public static void DateTest() {
		Date d1 = new Date(22,10,2025);
		d1.displayDate();
	}

}
