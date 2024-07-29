//Q.5 Accept a number from user and reverse it.

package practice02.Loop;

import java.util.*;
import static java.lang.System.out;
public class Demo05 
{
    public static void main(String[] args)
    {
         int n,r,rev=0;
         Scanner sc=new Scanner(System.in);
         out.println("Enter a number");
        n=sc.nextInt();
        sc.close();
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        out.println("Reverse of entered number is:"+rev);



    }
}
