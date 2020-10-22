import java.util.*;

/**
 * This class helps to find Duplicate records from a given Integer Array.
 **/
public class KWDuplicateNumOnArray {

  /**
   * This method helps to find duplicate records in an Integer Array.
   **/
  public static void findDuplicateFromArray(Integer[] intArray) {
    System.out.println("Executing findDuplicateFromArray Method");

    Set<Integer> set = new HashSet<Integer>();
    System.out.print("Duplicate Number is ::");
    for (Integer num : intArray) {

      if (!set.contains(num)) {
        set.add(num);

      } else {
        System.out.print(num + " , ");
      }
    }
    System.out.println("Completed findDuplicateFromArray Method");

  }

}