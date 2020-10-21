package com.knowledgewala.interviewqa;

public class KWHourGlassSum {

	public static void main(String[] args) {
		System.out.println("Hours Glass Sum Problem!");

		int[][] a = { { 12, 1, 2, 4, 22, 35, 11 }, { 4, 1, 2, 4, 22, 35, 11 }, { 0, 1, 2, 0, 22, 35, 11 },
				{ 2, 1, 2, 0, 22, 35, 11 }, { 1, 1, 2, 0, 20, 35, 11 }, { 0, 10, 2, 0, 2, 3, 1 } };

		int max_val = Integer.MIN_VALUE;

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				int current_hourseglass_sum = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j]
						+ a[i + 2][j + 1] + a[i + 2][j + 2];
				max_val = Math.max(max_val, current_hourseglass_sum);
			}
		}

		System.out.println("The Max Value is :" + max_val);

	}
}
