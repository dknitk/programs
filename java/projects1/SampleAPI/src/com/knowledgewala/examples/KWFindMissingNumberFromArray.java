package com.knowledgewala.examples;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class KWFindMissingNumberFromArray {

	public static void main(String[] args) {
		System.out.println("Find Missing number from Array");
		
		int[] intArray = {1,2,3,4,6,7,8,9};
		
		int lenght = intArray[intArray.length-1];
		
		int ActualSum = lenght*(lenght+1)/2;
		
		int sum = 0;
		int expectedSum = IntStream.of(intArray).sum();
		
		System.out.println("ActualSum is :"+ActualSum+" Expected Sum is: "+expectedSum);
		System.out.println("The Missing Number is :"+(ActualSum-expectedSum));
				}
}
