package com.knowledgewala.examples;

import java.util.Scanner;

public class KWPrintNNumWithoutLoop {

	public static void main(String[] args) {
		System.out.println("Print N Number without using Loop!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number ::");
		int number = sc.nextInt();

		printNumber(number, 1);

	}

	public static int printNumber(int num, int initValue) {
		if (initValue >= num) {
			System.out.println(num);
			return num;
		} else {
			System.out.println(initValue);
			return printNumber(num, initValue + 1);
		}

	}
}
