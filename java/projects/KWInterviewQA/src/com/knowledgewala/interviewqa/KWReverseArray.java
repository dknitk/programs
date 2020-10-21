package com.knowledgewala.interviewqa;

import java.util.Arrays;

public class KWReverseArray {

	public static void main(String[] args) {
		System.out.println("Reverese a Array");
		int[] arr = {12,1,2,4,22,33,11,33,455};
		System.out.println(Arrays.toString(arr));
		int[] result = reverseArray(arr);
		System.out.println(Arrays.toString(result));

	}

	private static int[] reverseArray(int[] arr) {

		int[] resultArray = new int[arr.length];
		int j=0;
		for (int i = arr.length - 1; i >= 0; i--) {
			resultArray[j] = arr[i];
			j++;
		}
		return resultArray;
	}
}
