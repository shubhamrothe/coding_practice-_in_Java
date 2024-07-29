//Q.3 Accept a number from user and do sum of digit.

package practice02.Loop;
import java.util.*;
import static java.lang.System.out;
public class Demo03 
{
    public static void main(String[] args)
    {
         int n;
         int sum=0;
         Scanner sc=new Scanner(System.in);
         out.println("Enter a number");
        n=sc.nextInt();
        sc.close();

    
        while(n!=0)
       {
        sum=sum+n%10;
        n=n/10;
       }

        out.println("sum="+sum);
    }
    
}
