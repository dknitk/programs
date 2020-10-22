import java.util.Arrays;

class KWWaysToDecode {

  private static int helper_dp(int[] data, int k, StringBuilder strBuilder) {   
    int result = 0;
    if (k == 0) {
      return 1;
    }else{
      int s = data.length - k;
    if (data[s] == 0) {
      
      return 0;
    }
    result = helper_dp(data, k - 1,strBuilder);

    if (k >= 2 && Arrays.copyOfRange(data, s, s + 2).length <= 26) {
      result += helper_dp(data, k - 2,strBuilder);
    }
    strBuilder.append(result+", ");
    return result;
    }    
  }
  public static int numWaysDP(int[] data,StringBuilder strBuilder) { 

    return helper_dp(data, data.length, strBuilder);
  }
}
