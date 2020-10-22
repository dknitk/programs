class KWReverseArray{

  public static void reverseArray(int[] array){

    int last = array.length-1;
    for(int i=0;i<array.length/2;i++){
      int temp = array[i];
      array[i] = array[last];
      array[last] = temp;

      last--;
    }
  }
}