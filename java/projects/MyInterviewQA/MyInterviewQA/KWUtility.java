import java.util.*;

/**
 * Utility class to help.
 **/
class KWUtility {

  /**
   * This Method helps to generate the array with Random data.
   **/
  public static Integer[] generateArray() {

    System.out.println("Executing generateArray Method");
    Integer[] intArray = new Integer[100];

    Random random = new Random();
    for (int i = 0; i < 100; i++) {
      intArray[i] = random.nextInt(200)+1;
    }
    System.out.println("********* Original Array is **********");
    for (Integer intValue : intArray) {
      System.out.print(" " + intValue);
    }

    System.out.println("\nCompleted generateArray Method");
    return intArray;
  }
}