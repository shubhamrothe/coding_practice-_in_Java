import static java.lang.System.out;
import java.util.*;
public class Day2_19
{
    public static void main(String[] args)
    {
        int small=0;
        Scanner sc=new Scanner(System.in);
        out.println("Enter 10 numbers");
        for(int i=1;i<=10;i++)
        {
            int n =sc.nextInt();
            if(i==1)
            {
                small=n;
            }
            else if(n<small)
            {
                small=n;
            }
        }
            out.println("The lowest number is"+small);     
    }
}