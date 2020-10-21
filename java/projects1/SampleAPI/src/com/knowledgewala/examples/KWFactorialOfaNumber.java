package com.knowledgewala.examples;

public class KWFactorialOfaNumber {

	public static void main(String[] args) {
		System.out.println("Factorial Of a Number Demo!");
		int n = 9;
		System.out.println("The Factorial Of Number "+n +" is::"+fact(n));
		
	}
	public static int fact(int n) {
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
}
