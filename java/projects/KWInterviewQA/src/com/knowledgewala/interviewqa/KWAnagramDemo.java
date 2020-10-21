package com.knowledgewala.interviewqa;

import java.util.Scanner;

/**
 * This class helps to check two String is anagram or not.
 * 
 * @author dknitk
 *
 */
public class KWAnagramDemo {

	/**
	 * The main method helps to start the execution of the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Anagram Problem!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter first String: ");
		String str1 = sc.nextLine();

		System.out.println("Please Enter second String: ");
		String str2 = sc.nextLine();

		System.out.println("The input String(s) are Anagram: " + isAnagram(str1, str2));
		// Close the Scanner
		sc.close();

	}

	/**
	 * This method helps to check two passed input string are Anagram or not.
	 * 
	 * @param str1 - Contains first Input String
	 * @param str2 - Contains second Input String
	 * @return boolean value true if anagram otherwise false
	 */
	public static boolean isAnagram(String str1, String str2) {
		// check both string length
		if (str1.length() != str2.length()) {
			return false;
		}
		// Instantiate Integer array to store the unicode of char
		int[] counts = new int[26];
		for (int i = 0; i < str1.length() - 1; i++) {
			// increase the counter at corresponding place
			counts[str1.charAt(i) - 'a']++;
			// decrease the counter at corresponding place
			counts[str2.charAt(i) - 'a']--;
		}
		// Iterate the array
		for (int i : counts) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}
}
