import static java.lang.System.out;
import java.util.*;
public class Day2_18
{
    public static void main(String[] args)
    {
        int large=0;
        Scanner sc=new Scanner(System.in);
        out.println("Enter 10 numbers");
        for(int i=1;i<=10;i++)
        {
            int n =sc.nextInt();
            if(i==1)
            {
                large=n;
            }
            else if(n>large)
            {
                large=n;
            }
        }
            out.println("The largest number is"+large);     
    }
}