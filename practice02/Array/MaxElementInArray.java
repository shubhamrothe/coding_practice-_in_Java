package practice02.Array;
import java.util.Arrays;

public class MaxElementInArray {

    //using traditional loop  -time complexity=O(n)
   /*  public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 2, 15};

        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("The maximum element in the array is: " + max);
    }*/

    //using Strem API   time complexity=O(n)-
   /* public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 2, 15};

        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("The maximum element in the array is: " + max);
    }*/ 

    public static void main(String[] args)
    {
        int[] arr = {10, 5, 8, 20, 2, 15};
         Arrays.sort(arr);
         System.out.print(arr[arr.length-1]);

    }
}







