import static java.lang.System.out;
import java.util.*;
public class Day2_20
{
    public static void main(String[] args)
    {
        int slarge=0,i,large=0;
        Scanner sc=new Scanner(System.in);
        out.println("Enter 10 numbers");
        for(i=1;i<=10;i++)
        {
            int n =sc.nextInt();
            if(i==1)
            {
                large=n;
            }
            else if(n>large)
            {
                slarge=large;    
                large=n;
            }
        }
            out.println("The largest number is"+large);    
            out.println("The 2nd largest number is"+slarge);     
    }
}