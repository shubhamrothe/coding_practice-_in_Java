import static java.lang.System.out;
import java.util.*;
public class Day2_2 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        out.print("Enter a number");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
          fact=fact*i;
        }
        out.print("Factorial of a number="+fact);
    }
}

