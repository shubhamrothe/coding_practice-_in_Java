//Q.11 Accept 10 numbers from user and print lowest number.

package practice02.Loop;
import static java.lang.System.out;
import java.util.*;
public class Demo11
{
    public static void main(String[] args)
    {
        int n;
       
        int min=0;
        Scanner  sc=new Scanner(System.in);
        out.println("Enter 10 numbers");
        for(int i=1;i<=10;i++)
        {
            n=sc.nextInt();
            if(i==1)
            {
                min=n;
            }
            else if(n<min)
            {
                min=n;
            }
        }
        sc.close();
        out.println("lowest number is" + min);
    }
}

