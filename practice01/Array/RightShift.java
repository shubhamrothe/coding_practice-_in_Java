package Array;
import static java.lang.System.out;
import java.util.*;

public class RightShift 
{
    public static void main(String[] args) 
    {   
	
        Scanner sc=new Scanner(System.in); 
        int[] arr= {2, 5, 7};
        int t=arr[arr.length-1];
        int i;
        for(i=arr.length-1;i>0 ;i--)
            arr[i]=arr[i-1];
        arr[i]=t;

        for(int n:arr)
         out.print(n);
    }

}