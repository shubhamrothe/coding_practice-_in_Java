import static java.lang.System.out;
import java.util.*;
public class Day2_8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter a number");
        int no=sc.nextInt();
        boolean r=isspecial(no);
        if(r==true)
            out.println("number is a special");
        else
         out.println("number is not a special");
       
    }

    public static boolean isspecial(int no)
    {
        int r,n,sum=0;
        n=no;
        while(no!=0)
        {
           r=no%10;
           sum=sum+factorial(r);
           no=no/10;
        }
        if(sum==n)
        return true;
        return false;
    }
    public static int factorial(int n)
    {
        int i,fact=1;
        for(i=2;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    } 
}




