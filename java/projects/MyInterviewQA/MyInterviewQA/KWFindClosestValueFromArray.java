class KWFindClosestValueFromArray{

  public static int findClosestValueFromArray(int[] array, int targetValue){
    int i = 0;
    int closestnumber = 0;
    for(int num : array){

      if((num == targetValue || num > targetValue) && array.length == 1){
        closestnumber = num;
        break;
      }else if(num < targetValue && i == array.length-1){
        closestnumber = num;
        break;
      }else if(num > targetValue){
        int prev = array[i-1];         

        if((targetValue-prev) > (num-targetValue)){
         closestnumber = num;
         break;
        }else{
          closestnumber = prev;
          break;
        }
      }
      i++;
    }
    return closestnumber;
  }
}