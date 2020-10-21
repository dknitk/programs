package com.knowledgewala.examples;

import java.util.Arrays;

public class KWBubbleSortDemo {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Bubble Sort!");
		int intArray[] = {9,8,7,5,6};
		System.out.println("Array Before Sorting :: "+Arrays.toString(intArray));
		bubbleSort(intArray);
		System.out.println("Array After Sorting :: "+Arrays.toString(intArray));
	}
	
	private static void bubbleSort(int[] intArray) {
		
		for(int i=1;i<intArray.length; i++) {
			for(int j=1;j<intArray.length;j++) {
				if(intArray[j-1]>intArray[j]) {
					int temp = intArray[j-1];
					intArray[j-1] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
	}

}
