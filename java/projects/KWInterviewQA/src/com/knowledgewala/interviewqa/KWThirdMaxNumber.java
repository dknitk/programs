package com.knowledgewala.interviewqa;

import java.util.Arrays;

public class KWThirdMaxNumber {

	public static void main(String[] args) {
		System.out.println("Reverese a Array");
		int[] arr = { 12, 1, 2, 4, 22, 35, 11, 33, 455 };
		System.out.println(Arrays.toString(arr));
		int thirdMaxNumber = thirdMaxNumber(arr);
		System.out.println(thirdMaxNumber);
	}

	public static int thirdMaxNumber(int[] arr) {
		Integer max_num = null;
		Integer second_max = null;
		Integer third_max = null;

		for (Integer n : arr) {
			if (n.equals(max_num) || n.equals(second_max) || n.equals(third_max)) {
				continue;
			}
			if (max_num == null || n > max_num) {
				third_max = second_max;
				second_max = max_num;
				max_num = n;

			} else if (second_max == null || n > second_max) {
				third_max = second_max;
				second_max = n;

			} else if (third_max == null || n > third_max) {
				third_max = n;
			}

		}
		if(third_max == null) {
			return max_num;
		}

		return third_max;

	}

}
