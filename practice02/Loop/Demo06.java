//Q.6 Accept a number from user and check if it is palindrome number or not eg (121)
package practice02.Loop;

import java.util.*;
import static java.lang.System.out;
public class Demo06 
{
    public static void main(String[] args)
    {
         int n,r,rev=0;
         Scanner sc=new Scanner(System.in);
         out.println("Enter a number");
        n=sc.nextInt();
        sc.close();
        int no=n;
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        out.println("Reverse of entered number is:"+rev);
        if(no==rev)
        out.println("Entered no is palindrome");
        else
        out.println("Entered no is not palindrome");

    }
}