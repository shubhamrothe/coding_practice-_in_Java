package practice02.QuestionsOfDSA.Array;
import java.util.*;
public class Searching 
{
    // Array creation
    int[] a;
    void arrayCreation(int n)
    {
        a=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
         sc.close();
    }
     int linearSearch(int key)
    {
        for(int i=0;i<a.length;i++)
        {
            if(key==a[i])
            return i;
        }
        return -1;
    }
    void BinarySearch(int start,int end,int key)
    {
        if(start<=end)
        {
          while(start<=end)
          {
                int mid=(start+end)/2;
            if(a[mid]==key)
           {
             System.out.println("Element is found at index "+mid);
              break;
           }
          else if(a[mid]<key)
           {
                start=mid+1;
           }
           else if(a[mid]>key)
           {
                end=mid-1;
           }
         }  
        }
        else{
            System.out.println("Element not found");
        }
    }
     
   public static void main(String[] args)
   {
     Searching ob=new Searching();
     Scanner sc=new Scanner(System.in);
     //System.out.println("Enter the size of array");
     //int n=sc.nextInt();
     ob. arrayCreation(5);
     System.out.println("Enter a key");
     int key=sc.nextInt();
     //int result=ob.linearSearch(key);
     
     ob.BinarySearch(0,4,key);
     sc.close();
     /*if(result==-1)
     System.out.println("key is not found");
     else
     System.out.println("key is found at "+ result + " index");*/
   } 
}
