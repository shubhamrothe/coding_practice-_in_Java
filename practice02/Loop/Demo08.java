//Q.8 Accept a number from user and print that many numbers after the number.


package practice02.Loop;

import java.util.*;
import static java.lang.System.out;
public class Demo08 
{
    public static void main(String[] args)
    {
         int n;
         Scanner sc=new Scanner(System.in);
         out.println("Enter a number");
        n=sc.nextInt();
        sc.close();

        for(int i=n;i>0;i--)
        {
            out.print(++n +" ");
        }
    }
    
}

