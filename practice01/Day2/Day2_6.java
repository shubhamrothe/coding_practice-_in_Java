import static java.lang.System.out;
import java.util.*;
public class Day2_6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter a number");
        int n=sc.nextInt();
        int rem,rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        out.print("Reverse of number:"+rev);
        if(n==rev)
        out.print("Numer is palindrome");
        else
        out.print("Numer is palindrome");
    }
}
