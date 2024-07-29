//Q.2 Accept a number from user and find a factorial of a number

package practice02.Loop;
import java.util.*;
import static java.lang.System.out;
public class Demo02 
{
    public static void main(String[] args)
    {
         int n,fact=1;
         Scanner sc=new Scanner(System.in);
         out.println("Enter a number");
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        out.println("Factorial of a number:"+fact);
    }
}
