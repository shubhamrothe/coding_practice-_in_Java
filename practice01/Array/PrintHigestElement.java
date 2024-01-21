//Accept 5 element in an array and print highest element

package Array;
import static java.lang.System.out;
import java.util.*;
public class PrintHigestElement 
{
    public static void main(String[] args)
    {
        int max=0;
        
        Scanner sc=new Scanner(System.in);
        out.print("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        out.print("Enter the elements of array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        out.println("Higest element is "+max);
    }
    
}
