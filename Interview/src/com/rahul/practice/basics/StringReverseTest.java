package com.rahul.practice.basics;

/*
 * Using for loop
 * Using recursion
 * Using StringBuffer
*/

class StringReverse {

	public static String reverseUsingLoop(String str) {
		String reverse = "";

		for (int i = 0; i < str.length(); i++) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println("reverseString using loop:" + reverse);
		return reverse;
	}

	public static String reverseUsingRecursion(String str) {
		String reverse = "";
		if (str.length() == 0) {
			return str;
		}

		reverse = reverse + reverseUsingRecursion(str.substring(0, str.length() - 1));

		System.out.println("reverseString using loop:" + reverse);
		return reverse;
	}
}

public class StringReverseTest {
	public static void main(String[] args) {

		StringReverse.reverseUsingLoop("Rahul");
		StringReverse.reverseUsingRecursion("Rahul");
	}
}
