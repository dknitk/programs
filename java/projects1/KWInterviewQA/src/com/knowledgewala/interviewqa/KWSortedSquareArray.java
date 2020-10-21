package com.knowledgewala.interviewqa;

import java.util.Arrays;

public class KWSortedSquareArray {

	public static void main(String[] args) {
		System.out.println("Sorted Square Array Problem!");
		int[] array = { -7, -5, -4, -2, 3, 6 };
		int[] output = sortedSquareArray(array);

		System.out.println(Arrays.toString(output));

	}

	public static int[] sortedSquareArray(int[] array) {

		int left = 0;
		int right = array.length - 1;
		int[] resultArray = new int[array.length];

		/*
		 * for (int i = array.length - 1; i > 0; i--) {
		 * 
		 * if (Math.abs(array[left]) > array[right]) { resultArray[i] = array[left] *
		 * array[left]; left++; } else { resultArray[i] = array[right] * array[right];
		 * right--; }
		 * 
		 * }
		 */
		int i = array.length - 1;
		while (left <= right) {
			if (Math.abs(array[left]) > array[right]) {
				resultArray[i] = array[left] * array[left];
				left++;
			} else {
				resultArray[i] = array[right] * array[right];
				right--;
			}
			i--;
		}

		return resultArray;
	}
}
