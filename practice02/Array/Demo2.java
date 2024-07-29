//. Accept 5 number in an array and sort it (bubble sort)

package practice02.Array;
import static java.lang.System.out;
public class Demo2 
{
    public static void main(String[] args) 
    {   
	    int[] arr= {5,6,2,1,3};
	     bsort(arr);
        for(int n:arr)
	    out.print(n);
    }
    public static void bsort(int[] arr) 
    {
        int t,i,j;
        int n=arr.length;

        for(i=0;i<n-1;i++)
            {
                for(j=0;j<n-1-i;j++)
                {
                if(arr[j]>arr[j+1])
                {	t=arr[j];		
                    arr[j]=arr[j+1];
                    arr[j+1]=t;     
                }		
                }
            }
   }
    
}
