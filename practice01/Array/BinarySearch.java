package Array;

import static java.lang.System.out;
import java.util.*;
public class BinarySearch {
public static void main(String[] args) {   	
	Scanner sc=new Scanner(System.in);
         int no=8;
	int[] arr= {1,2,3,4,5,6,7,8,9,10};
	bsearch(arr,no);
	 
  }
  public static void bsearch (int[] arr,int no) {
    int l=0,u=9,m,flag=0;
         while(l<=u) 
         {   m=(l+u)/2;
              if(no>arr[m])  
              l=m+1;
           else if(no<arr[m]) 
           u=m-1; 
               else{
               flag=1;
            break;
           }
        }
       if(flag==1)
      out.print("element found");
   else
      out.print("element Not found");
    
      }
   }