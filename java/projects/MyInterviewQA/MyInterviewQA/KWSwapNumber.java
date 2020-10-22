public class KWSwapNumber{

public static void swapNumber(int a , int b){

System.out.println("********* Original Number(s) "+a +" , "+b);
  //a = a+b;
  //b = a -b;
  //a = a-b;

  a = (a + b) - (b = a);
  System.out.println("********* After Swapped "+a +" , "+b);
}

}