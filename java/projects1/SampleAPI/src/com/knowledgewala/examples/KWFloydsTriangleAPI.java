package com.knowledgewala.examples;

import java.util.Scanner;

public class KWFloydsTriangleAPI {
	public static void main(String[] args) {

		System.out.println("**** Welcome to Floyd Triangle API ****");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of Row Required = ");
		int r = sc.nextInt();
		int initNum = 1;
		System.out.println("****************************************");
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(initNum+" ");	
				initNum++;
			}			
			System.out.println();

		}
		System.out.println("****************************************");
	}
}
