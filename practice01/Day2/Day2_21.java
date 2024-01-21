import static java.lang.System.out;
import java.util.*;
public class Day2_21
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter the value of n");
        int n=sc.nextInt();
        out.println("Enter the value of m");
        int m=sc.nextInt();
        if(n>=m)
        {
            for(int i=1;i<=n;i++)
            {
              if(i%m==0)
              {
                out.println(i+" is divisible ");
                if(i%2==0)
                out.println(i+" is even no");
              }
              else
                out.println(i+" is odd no");
            }
        }
        else
        out.println("n can not be divisible by m becouse n<m");
    }
}

