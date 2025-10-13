package com.sumbeam;

public class CountString {
	public static void main(String[] args) {
		String str = "  abcdef   ";
		int res = str.trim().length();
		System.out.println("Number of words: "+res);
	}
}
