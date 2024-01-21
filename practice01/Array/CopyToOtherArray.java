package Array;
import static java.lang.System.out;
import java.util.*;
public class CopyToOtherArray 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.print("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int[] cpy=new int[size];
        out.print("Enter the elements of array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            cpy[i]=arr[i];
        }
        
        for(int i:cpy)
        {
            out.print(i+" ");
        }
        sc.close();
    }
    
    
}
