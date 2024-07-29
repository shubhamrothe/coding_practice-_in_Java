//write a program to print sum of digits of a number

import static java.lang.System.out;
import java.util.*;
public class Day2_4 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter a numer");
        int n=sc.nextInt();
        int rem,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;

        }
        out.println("Sum of digits of a numer:"+sum);
    }
}

