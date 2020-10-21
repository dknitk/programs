package com.knowledgewala.interviewqa;

public class KWDifferenceofSumOfDiagonalsDemo {
	public static void main(String[] args) {
		System.out
				.println("Given a Square Matrix, Calculate the absolute difference between the sums of its diagonals");
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 8, 9 } };
		System.out.println(diffofSumOfDiagonals(a));

	}

	public static int diffofSumOfDiagonals(int[][] a) {

		int left_to_right = 0;
		int right_to_left = 0;
		int i = 0, j = 0, k = 0;
		int l = a.length - 1;
		int row = a.length;

		while (i < row && j < a[i].length && k < row && l >= 0) {
			left_to_right += a[i][j];
			right_to_left += a[k][l];

			i += 1;
			j += 1;
			k += 1;
			l -= 1;
		}
		return Math.abs(left_to_right - right_to_left);
	}

}
