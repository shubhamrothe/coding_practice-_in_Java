package Array;
import static java.lang.System.out;

public class PrintLowestElement 
{
    public static void main(String[] args)
    {
        int[] arr={8,5,3,1,9};
        int min=arr[0]; int minindex=0;
       int size=arr.length;
       for(int i=1;i<size;i++)
       { 
         if(min>arr[i]) 
           {
              min=arr[i];
               minindex=i;
            }
        }
        out.print("Lowest Element is" +min +"and at index "+minindex);
    }
    
}
