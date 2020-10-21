package com.knowledgewala.interviewqa;

import java.util.Scanner;

/**
 * This program helps to reverse a String. Time Complexity is O(n)
 * 
 * @author dknitk
 *
 */
public class KWReverseStringDemo {
	/**
	 * The main method helps to start the execution of the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Reverse a String Program!");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a String: ");
		String str = scanner.nextLine();
		System.out.println("String before Reverse: "+str);
		System.out.println("String after Reverse: "+reverseAString(str));
		
		scanner.close();

	}

	/**
	 * This method helps to reverse a String. It converts the String in character
	 * Array and swap the character as given below - first element with the last
	 * element second element with the second last element and o on...
	 * 
	 * @param str
	 * @return String
	 */
	public static String reverseAString(String str) {

		int i = 0;
		// Convert the String to char array
		char[] charArray = str.toCharArray();
		int j = str.length() - 1;

		while (i < j) {
			char temp = charArray[i];
			charArray[i++] = charArray[j];
			charArray[j--] = temp;
		}
		return new String(charArray);

	}

}
