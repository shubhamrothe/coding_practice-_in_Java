import static java.lang.System.out;
import java.util.*;
public class Day2_7 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter a number");
        int n=sc.nextInt();
        int ans;
        for(int i=1;i<=10;i++)
        {
            ans=n*i;
            out.println(+n+"*"+i+"="+ans);
        }
        out.println();
    }
}
