package com.knowledgewala.examples;

import java.util.Scanner;

public class KWPalindromeString {
	public static void main(String[] args) {
		System.out.println("**** Palindrome String Example ****");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String= ");
		String original = sc.nextLine();

		StringBuilder reverseString = new StringBuilder("");
		
		for (int i = original.length() - 1; i >= 0; i--) {
			reverseString.append(original.charAt(i));
		}
		System.out.println(reverseString);
		if (original.equals(reverseString.toString())) {
			System.out.println("String is Palindrom!");
		} else {
			System.out.println("String is not Palindrom!");
		}

	}

}
