package com.sumbeam;

public class ReverseString {
	public static void main(String[] args) {
		String str = "sunbeam";
		String strRev = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			strRev += str.charAt(i);
		}
		System.out.println(strRev);
	}

}
