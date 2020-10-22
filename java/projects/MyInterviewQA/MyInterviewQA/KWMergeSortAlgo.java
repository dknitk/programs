import java.util.*;

class KWMergeSortAlgo{

  public static void executeMergeSort(){

    System.out.println("mergesort");

    int[] input = { 87, 57, 370, 110, 90, 6};

    System.out.println("array before sorting");
    System.out.println(Arrays.toString(input));

    // sorting array using MergeSort algorithm
    mergeSort(input);

    System.out.println("array after sorting using mergesort algorithm");
    
    System.out.println(Arrays.toString(input));

  }

  public static void mergeSort(int[] input){
    mergesort1(input, 0, (input.length - 1));
  }
  private static void mergesort1(int[] input, int start, int end) {
    // break problem into smaller structurally identical problems
    int mid = (start + end) / 2;
    if (start < end) {
      mergesort1(input, start, mid);
      mergesort1(input, mid + 1, end);
    }

    // merge solved pieces to get solution to original problem
    int i = 0, first = start, last = mid + 1;
    int[] tmp = new int[end - start + 1];

    while (first <= mid && last <= end) {
      tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
    }
    while (first <= mid) {
      tmp[i++] = input[first++];
    }
    while (last <= end) {
      tmp[i++] = input[last++];
    }
    i = 0;
    while (start <= end) {
      input[start++] = tmp[i++];
    }
   }
}