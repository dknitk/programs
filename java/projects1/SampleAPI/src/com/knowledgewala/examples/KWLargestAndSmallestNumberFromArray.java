package com.knowledgewala.examples;

public class KWLargestAndSmallestNumberFromArray {

	public static void main(String[] args) {
		System.out.println();
		
		int[] intArray = {1,4,2,34,56,67};
		int largestNum = Integer.MIN_VALUE;
		int smallestNum = Integer.MAX_VALUE;
		
		for (int i : intArray) {
			if(largestNum < i) {
				largestNum = i;				
			}
			if(smallestNum > i) {
				smallestNum = i;
			}
		}
		System.out.println("Largest Number in the Array is :: "+largestNum);
		System.out.println("Smallest Number in the Array is :: "+smallestNum);
	}
}
