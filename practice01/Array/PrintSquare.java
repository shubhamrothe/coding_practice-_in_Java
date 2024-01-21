package Array;
import static java.lang.System.out;
import java.util.*;

public class PrintSquare 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.print("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        out.print("Enter the elements of array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        dispsqr(arr);
        for(int i:arr)
        {
            out.print(i+" ");
        }
    }
    public static  void dispsqr(int[] a)
    {
        for(int j=0;j<a.length;j++)
        {
            a[j]=a[j]*a[j];
        }
    }
    
}
