//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.




import static java.lang.System.out;
import java.util.*;
public class FindMissingNumber 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter the value of n");
        int n=sc.nextInt();
        int[] array=new int[n-1];
        for(int i=0;i<n-1;i++)
        {
            array[i]=sc.nextInt();
        }

        int missingNumber=FindMissingNumber(array, n);
        out.print("Missing Number is:" + missingNumber );
    }
    
    public static int FindMissingNumber(int array[], int n)
    {
        int expectedSum=(n*(n+1))/2;
        int actualSum=0;
        for(int i=0;i<n-1;i++)
        {
            actualSum +=array[i];
        }
        return expectedSum - actualSum;
    }
}
