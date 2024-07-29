//Q.7 Accept a number from user and print next 5 number

package practice02.Loop;


    import java.util.*;
import static java.lang.System.out;
public class Demo07 
{
    public static void main(String[] args)
    {
         int n;
         Scanner sc=new Scanner(System.in);
         out.println("Enter a number");
        n=sc.nextInt();
        sc.close();

        for(int i=0;i<5;i++)
        {
            out.print(++n +" ");
        }
    }
    
}
