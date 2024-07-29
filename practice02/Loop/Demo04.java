//Q.4 Accept a number from user and count number of digits.


package practice02.Loop;
import java.util.*;
import static java.lang.System.out;
public class Demo04 
{
    public static void main(String[] args)
    {
         int n;
         int count=0;
         Scanner sc=new Scanner(System.in);
         out.println("Enter a number");
        n=sc.nextInt();
        sc.close();
       while(n!=0)
        {
            
         n=n/10;
         count++;
        }
 
         out.println("no of digits="+count);
 
         
    }
    
}
