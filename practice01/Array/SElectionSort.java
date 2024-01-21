package Array;

import static java.lang.System.out;
import java.util.*;


public class SElectionSort {
public static void main(String[] args) {   
	
	Scanner sc=new Scanner(System.in);

	int[] arr= {5,6,2,1,3};
	 ssort(arr);
    for(int n:arr)
	out.print(n);
	
  }
    public static void ssort(int[] arr) {
	
	 int t,i,j;
	 int n=arr.length;

	for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
			  if(arr[i]>arr[j])
			  {	
				t=arr[i];		
				arr[i]=arr[j];
				arr[j]=t;
				
			  }		
			}
		}


   }
}
