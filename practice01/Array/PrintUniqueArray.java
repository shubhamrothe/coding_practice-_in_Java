package Array;

import static java.lang.System.out;
import java.util.*;
public class PrintUniqueArray {
public static void main(String[] args) {   
	
	Scanner sc=new Scanner(System.in);
	 int[] arr= {1,2,3,1,4,5,6,1,2};
	 int i,j,k;
	 int l=arr.length;
	for(i=0;i<l-1;i++)
	{
		for(j=i+1; j<l;j++)
		{
			if(arr[i]==arr[j])
			{
				for(k=j;k<l-1;k++)
					 arr[k]=arr[k+ 1];
				j--;
				l--;
            }
		}	
	}
     for(int n=0;n<l;n++)
	    out.print(arr[n]);
    }

  }