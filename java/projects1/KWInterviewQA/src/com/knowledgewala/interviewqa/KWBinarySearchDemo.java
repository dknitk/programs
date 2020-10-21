package com.knowledgewala.interviewqa;

public class KWBinarySearchDemo {
	public static void main(String[] args) {
		System.out.println("Binary Search Algorithms");
		int[] a = { 1, 3, 5, 7, 9, 10, 23, 34, 45, 56, 77 };
		System.out.println(binarySearch(a, 33));
	}

	public static int binarySearch(int[] a, int key) {

		if (a.length == 0)
			return -1;

		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			int midPoint = left + (right - left) / 2;
			if (a[midPoint] == key) {
				return midPoint;
			} else if (a[midPoint] > key) {
				right = midPoint - 1;
			} else {
				left = midPoint + 1;
			}
		}
		return -1;

	}

}
