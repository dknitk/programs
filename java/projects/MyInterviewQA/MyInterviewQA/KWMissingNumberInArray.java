import java.util.*;

/**
 * This Program helps to find out missing number between 1 to 100 from a Array
 * of Integer.
 **/
class KWMissingNumberFromArray {

  // Main method to execute the program
  public static void main(String[] args) {
    System.out.println("Hello world!");

    KWMissingNumberFromArray.findMissingNumber(KWUtility.generateArray());
  }

  // Method to find out Missing Number between 1 to 100
  public static void findMissingNumber(Integer[] array) {
    System.out.println("Executing findMissingNumber Method");

    Boolean[] booleanArray = new Boolean[100];

    for (Integer num : array) {
      if (num < booleanArray.length) {
        booleanArray[num] = Boolean.TRUE;
        // System.out.println(booleanArray[num]);
      }
    }
    System.out.println("Missing Number are:");
    int counter = 0;
    for (Boolean b : booleanArray) {
      if (b == null) {
        System.out.print(counter + 1 + " , ");
      }
      counter++;
    }
    // System.out.println(map);
    System.out.println("\nCompleted findMissingNumber Method");

  }

}