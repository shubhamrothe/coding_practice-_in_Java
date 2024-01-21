package Array;

import static java.lang.System.out;
import java.util.*;
public class Myclass 
{
    public static void main(String[] args) 
    {  
	
        Scanner sc=new Scanner(System.in);
        int[] arr,cpy;
        out.print("enter size of array");
        int size=sc.nextInt();
        arr=new int[size];
        cpy=new int[5];
        int i; 
        for(i=0;i<arr.length;i++)
        {       arr[i]=sc.nextInt();
        }
        for(int n:cpy)
        out.println(n);

        cpy=arr;
        System.out.println(cpy.hashCode());
        for(int n:cpy)
        out.println(n);
    }
}