//Q.12 Accept 10 numbers from user and print highest and 2nd highest number.

package practice02.Loop;
import static java.lang.System.out;
import java.util.*;
public class Demo12
{
    public static void main(String[] args)
    {
        int n;
        int max=0;
        int second=0;

        Scanner  sc=new Scanner(System.in);
        out.println("Enter 10 numbers");
        for(int i=1;i<=3;i++)
        {
            n=sc.nextInt();
            // if(i==1)
            // {
            //     second=n;
            // }
            if(max<n)
            {
                second=max;
                max=n;
                
            }
        }
        
        out.println("2higest number is " +second);
    }
}
