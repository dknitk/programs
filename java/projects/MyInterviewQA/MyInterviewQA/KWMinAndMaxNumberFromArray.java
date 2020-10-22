class KWMinAndMaxNumberFromArray{

  public static void findMinAndMaxNumberFromArray(Integer[] intArray){
    System.out.println("Executing findMinAndMaxNumberFromArray Method");

    Integer min=99999, max=0;
    for(Integer num : intArray){      
      if(num > max){
        max = num;
      }else if(num < min){
        min = num;
      }
    }
    System.out.println("Max Number is ::"+max);
    System.out.println("Min Number is ::"+min);

    System.out.println("\nCompleted findMinAndMaxNumberFromArray Method");
  }
}