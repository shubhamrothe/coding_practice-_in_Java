
//Q.10 Accept 10 numbers from user and print highest number.
package practice02.Loop;

import static java.lang.System.out;
import java.util.*;
public class Demo10
{
    public static void main(String[] args)
    {
        int n;
        int max=0;
        Scanner  sc=new Scanner(System.in);
        out.println("Enter 10 numbers");
        for(int i=1;i<=10;i++)
        {
            n=sc.nextInt();
            if(max<n)
            {
                max=n;
            }
        }
        sc.close();
        out.println("higest number is"+ max);
    }
}
