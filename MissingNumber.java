import java.util.*;

class Main
{
  public static void main (String[]args)
  {
    int[] arr = new int[] {1,2,3,4,5,7,8,9,10};
    System.out.println(missingNumber(arr));
  }
  
  private static int missingNumber(int[] arr) {
      int n = arr.length + 1;
      int total_sum = (n*(n+1))/2;
      for (int i=0; i<n-1; i++) {
          total_sum -= arr[i];
      }
      return total_sum;
  }
}