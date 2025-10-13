package com.sumbeam;

public class Palindrome {
	 public static void main(String[] args) {
		String str = "racecar";
		int left = 0;
		int right = str.length() -1;
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				System.out.println("Not a palindrome");
				return;
			}
			else {
				left++;
				right--;
			}
		}
		System.out.println("String is a palindrome");
	}
}
