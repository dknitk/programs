package com.knowledgewala.interviewqa;

import java.util.Arrays;

public class KWBubbleShortAlgoImproved {

	public static void main(String[] args) {
		int[] array = {-3,-9,-2,-1};
			//{-1,0,1}; 
			//{20,12,45,19,91,55};
			//{ 2, 5, 7, 1, 4, -3, 10 };
		
		String[] arrayString = {"Ada","C++","Lisp","Java","Scala"};
		bubbleSortAlgo(array);
		bubbleSortAlgo(arrayString);

	}

	public static void bubbleSortAlgo(int[] array) {

		System.out.println("UnSorted Array::" + Arrays.toString(array));
		boolean isSwapped = true;
		int last = array.length - 2;

		while (isSwapped) {
			isSwapped = false;
			for (int i = 0; i <= last; i++) {
				if(array[i] > array[i+1]) {
					swap(array, i, i+1);
					isSwapped = true;
				}
			}
		}

		System.out.println("Sorted Array::" + Arrays.toString(array));
	}
	
	public static void bubbleSortAlgo(String[] array) {

		System.out.println("UnSorted Array::" + Arrays.toString(array));
		boolean isSwapped = true;
		int last = array.length - 2;

		while (isSwapped) {
			isSwapped = false;
			for (int i = 0; i <= last; i++) {
				if(array[i].compareTo(array[i+1]) > 0) {
					swap(array, i, i+1);
					isSwapped = true;
				}
			}
		}

		System.out.println("Sorted Array::" + Arrays.toString(array));
	}

	public static void swap(int[] array, int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void swap(String[] array, int i, int j) {

		String temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
