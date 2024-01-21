package Array;
import static java.lang.System.out;
import java.util.*;
public class LeftShift 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.print("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        out.print("Enter the elements of array");
        int i;
        for( i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int t=arr[0];
        for( i=0;i<arr.length-1;i++)
           { arr[i]=arr[i+1];}
            arr[i]=t;
            for(int n:arr)
            {
                out.print(n);
            }
    }
    
}
