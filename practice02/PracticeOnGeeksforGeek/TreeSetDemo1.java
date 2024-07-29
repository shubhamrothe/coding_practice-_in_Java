package practice02.PracticeOnGeeksforGeek;


import static java.lang.System.out;
import java.util.*;

public class TreeSetDemo1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        out.println("Enter the elements of  sorted array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        out.print("Enter a number");
        int num=sc.nextInt();

        int left=0,right=size-1;
        int first=-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==num){
                
            }
        }
    }
}