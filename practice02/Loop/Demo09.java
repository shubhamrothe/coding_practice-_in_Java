//Q.9 Accept term from user and print Fibonacci series.

package practice02.Loop;

import java.util.*;
import static java.lang.System.out;
public class Demo09 
{
    public static void main(String[] args)
    {
         int n;
         int first=0,second=1;
         Scanner sc=new Scanner(System.in);
         out.println("Enter a number");
        n=sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; ++i) 
        {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        
    }
}