import java.util.*;
//Counting the frequency of each number
class Main
{
  public static void main (String[]args)
  {
    int[] arr = new int[]{ 1, 2, 3, 4, 5, 0, 8, 7, 2, 1, 3, 1, 8, 9, 10 };
      printFreq (arr);
  }

  private static void printFreq (int[]arr)
  {
    Map < Integer, Integer > numList = new HashMap <> ();
    int count = 0;
    for (int i = 0; i < arr.length; i++)
      {
	if (!numList.containsKey (arr[i]))
	  {
	    numList.put (arr[i], 1);
	  }
	else
	  {
	    numList.put (arr[i], numList.get(arr[i]) + 1);
	  }
      }

  for (Map.Entry < Integer, Integer > x:numList.entrySet ())
      {
	System.out.println (x.getKey () + " " + x.getValue ());
      }
  }
}
