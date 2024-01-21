import static java.lang.System.out;
import java.util.*;
public class Day3_13 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.print("Enter a value");
        int n=sc.nextInt();
        double sum=0.0;
        //while(n>0)
        //{
            for( ;n!=0;n--)
            {
             sum=sum+(double)1/n;
           //n--;
            out.print(sum+" ");
          }
            out.println();
            out.print(sum);
    }  
}
