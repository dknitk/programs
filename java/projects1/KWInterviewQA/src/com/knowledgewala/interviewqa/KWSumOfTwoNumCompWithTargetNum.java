package com.knowledgewala.interviewqa;

import java.util.HashMap;
import java.util.Map;

public class KWSumOfTwoNumCompWithTargetNum {

	public static void main(String[] args) {

		int[] intArray = { 2, 7, 11, 15 };
		int targetNumber = 9;
		
		//findIndexofTwoNumSumEQtoTargetNum(intArray, targetNumber);
		int[] indexArray = findIndexofTwoNumSumEQtoTargetNum1(intArray, targetNumber);
		System.out.println("["+indexArray[0]+" , "+indexArray[1] + "]");
	}

	public static void findIndexofTwoNumSumEQtoTargetNum(int[] intArray, int targetNumber) {

		if (intArray != null && intArray.length > 0) {
			int count = 0;
			int a = 0;
			boolean isIndexFound = Boolean.FALSE.booleanValue();

			while (count < intArray.length) {

				for (int i = count + 1; i < intArray.length; i++) {

					a = intArray[count];
					int b = intArray[i];

					if ((targetNumber - b) == a) {

						System.out.println("indexes are ::" + "[" + count + ", " + i + "]");
						isIndexFound = Boolean.TRUE.booleanValue();

					}
				}
				count++;
			}

			if (!isIndexFound) {
				System.out.println("No Matching Index Found........");
			}

		}
	}

	public static int[] findIndexofTwoNumSumEQtoTargetNum1(int[] intArray, int targetNumber) {

		Map map = new HashMap();

		for (int i = 0; i < intArray.length; i++) {

			int complement = targetNumber - intArray[i];

			if (map.containsKey(complement)) {
				
				return new int[] { (int) map.get(complement), i };
			}
			map.put(intArray[i], i);

		}
		throw new IllegalArgumentException("No Matching Index Found........");
	}
	
	

}
