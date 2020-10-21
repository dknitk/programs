package com.knowledgewala.examples;

import java.util.Scanner;

public class KWVowelDemo {
	public static void main(String[] args) {
		System.out.println("Welcome to Vowel Test!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String ***** ");
		String str = sc.nextLine();
		
		char[] chars = str.toLowerCase().toCharArray();
		int count = 0;
		for (char c : chars) {
			
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
			
		}
		System.out.println("Total Number of Vowel available are: " +count);
	}
}
