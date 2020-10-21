package com.knowledgewala.examples;

import java.util.Scanner;

public class KWPyramidPatternDemo {
	public static void main(String[] args) {
		System.out.println("Welcome to Pyramid Pattern!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the lenght of the Pyramid!");
		int lenght = sc.nextInt();
		for (int i = lenght; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
