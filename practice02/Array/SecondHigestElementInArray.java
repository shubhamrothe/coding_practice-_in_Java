package practice02.Array;
import java.util.*;
public class SecondHigestElementInArray 
{

     //time complexity=O(n*log(n))
   /*  public static void main(String[] args)
    {
      int[] arr = {10, 5, 8, 20, 2, 15};
      Arrays.sort(arr);
      System.out.print("Second Higest Element of Array = "+arr[arr.length-2]);
    } */
    

    //time complexity=O(n*log(n))
    public static void main(String[] args)
    {
      int[] arr = {10, 5, 8, 20, 2, 15};
      int secondHigestElement=Arrays.stream(arr)
      .distinct()//remove duplicate
      .boxed()//convert to Integer Object
      .sorted(Collections.reverseOrder())//sort in reverse order
      .skip(1)//skip 1st i.e.higest element
      .findFirst()//get first element(second higest)
      .orElse(-1);//default faule if not found
      System.out.print("Second Higest Element of Array ="+secondHigestElement);

    }
}
