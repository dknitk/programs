import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // Integer[] intArray = KWUtility.generateArray();
    // Problem 1: Find Missing Number From Array Program
    // KWMissingNumberFromArray.findMissingNumber(intArray);
    // Problem 2: Find Duplicate Number from Array Program
    // KWDuplicateNumOnArray.findDuplicateFromArray(intArray);

    // Problem 3: Find Min and Max Number from Array Program
    // KWMinAndMaxNumberFromArray.findMinAndMaxNumberFromArray(intArray);

    // Problem 4: Find the Closest Number from the given shorted Array
    int[] array = { 2, 5, 5, 6, 7, 8, 9, 9, 102, 106, 110, 200, 210 };
    int targetNumber = 155;
    // int closestNumber =
    // //KWFindClosestValueFromArray.findClosestValueFromArray(array, targetNumber);
    // System.out.println("The Closest number is :: " + closestNumber);
    // Problem 5: MergeSort Algorithm
    //KWMergeSortAlgo.executeMergeSort();

    //KWReverseArray.reverseArray(array);

    // System.out.println("reversed String array in Java : " +
    // Arrays.toString(array));
    // Problem 6: Swap Number Algorithm
    // KWSwapNumber.swapNumber(10,20);
    int[] data = { 1, 2, 3, 4, 5 };
    StringBuilder strBuilder = new StringBuilder();
    System.out.println("********* Way to Descript Problem Result is ::******** "+KWWaysToDecode.numWaysDP(data, strBuilder) + " "+strBuilder);
    
    int[][] costs = {
        {17,2,17},
        {16,16,5},
        {14,3,19}
    };
    int cost = KWPaintAHousePrblm.minCosts(costs);
    System.out.println(" Cost is :: "+ cost);
  }
}