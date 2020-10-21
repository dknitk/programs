package com.knowledgewala.interviewqa;

import java.util.Arrays;

public class KWBubbleShortAlgo {

	public static void main(String[] args) {
		int[] array = {2,5,7,1,4,-3,10};
		bubbleSortAlgo(array);

	}
	
	public static void bubbleSortAlgo(int[] array) {
		
		System.out.println("UnSorted Array::"+Arrays.toString(array));
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=array.length-1;j>i; j--) {
				if(array[j] < array[j-1]) {
					swap(array, j, j-1);
				}
			}
		}
		System.out.println("Sorted Array::"+Arrays.toString(array));
	}
	
	public static void swap(int[] array, int i ,int j) {
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
