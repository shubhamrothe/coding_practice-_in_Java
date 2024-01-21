/*Accept tree digit number from and check it is armstrong or not */

import static java.lang.System.out;
import java.util.*;
public class Day2_9 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter a number");
        int n=sc.nextInt();
        int temp=n;
        int rem,sum=0,cube=1;
        while(n!=0)//153   15   1    0
        {
            rem=n%10;//3     5    1
            cube=rem*rem*rem;  //27   125  1
            sum=sum+cube;//27    152     153
            n=n/10;//15   1     0
        }
        //out.println("Sum of cube of digits of number ="+sum);
        if(temp==sum)
        out.println("Entered numer is armstrong number");
        else
        out.println("Entered numer is not armstrong number");
    }
}




