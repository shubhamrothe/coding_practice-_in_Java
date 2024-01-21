import static java.lang.System.out;
import java.util.*;
public class Day2_3
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int countp=0,countn=0,count0=0;
        for(int i=0;i<10;i++)
        {
          out.print("Enter a number");
          int n=sc.nextInt();
          if(n>0)
            countp++;
          else if(n<0)
            countn++;
          else if(n==0)
            count0++;
        }
        out.println("Number of positive numbers:"+ countp);
        out.println("Number of negative numbers:"+countn);
        out.println("Number of zero numbers:"+count0);

    }
}
