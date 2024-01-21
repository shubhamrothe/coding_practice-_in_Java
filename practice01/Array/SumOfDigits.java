package Array;
import static java.lang.System.out;
import java.util.*;
public class SumOfDigits 
{
    public static void main(String[] args)
    {
        double sum=0;
        double avg;
        Scanner sc=new Scanner(System.in);
        out.print("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        out.print("Enter the elements of array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        out.println("Sum of digits: "+sum);
        avg=sum/arr.length;
        //out.println("avg of sum of digits: "+(double)(sum % arr.length));
        out.println(avg);
    }
    
}
