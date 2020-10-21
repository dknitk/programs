package com.knowledgewala.examples;

import java.util.Arrays;

public class KWSecondLargenstElementFromArr {

	public static void main(String[] args) {
		System.out.println("Second Highest Elements From the Array::");
		int[] intArray = { 1, 100, 123, 2, 34, 55, 88 };
		System.out.println("Array Before Sorting ::" + Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println("Array After Sorting ::" + Arrays.toString(intArray));
		int n=2;
		System.out.println(" The nth Largest Element is ::"+intArray[intArray.length-n]);
	}
}
