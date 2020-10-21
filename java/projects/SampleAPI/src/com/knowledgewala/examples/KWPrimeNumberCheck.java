package com.knowledgewala.examples;

import java.util.Scanner;

public class KWPrimeNumberCheck {
	public static void main(String[] args) {
		System.out.println("Check Prime Number or Not");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :");
		int num = sc.nextInt();
		boolean isPrimeNumber = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		if (isPrimeNumber) {
			System.out.println(num + " is a Prime Number.");
		} else {
			System.out.println(num + " is not a Prime Number.");
		}
	}
}
