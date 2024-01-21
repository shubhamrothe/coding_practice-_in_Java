import static java.lang.System.out;
import java.util.*;
public class Day2_10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter a number and 0 to stop the loop"); 
        int n=1,sum=0;
        /*while(n>0)
        {
         //for(int i=1;i>0;i++)
            n=sc.nextInt();
            if(n>0)
            {
            sum=sum+n;
            }
            else
            out.print("Total="+sum);
         }*/
        for(int i=1;i>0;i++)
        {
            n=sc.nextInt();
            if(n>0)
            {
                sum=sum+n;
            }
            else
            out.print("Total="+sum);
        }   
    }
}

