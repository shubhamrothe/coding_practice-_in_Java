//Q5. Accept a number from user check if it is odd or even without using (modular)% operator

package practice02.If;
import java.util.*;
import static java.lang.System.out;
public class Demo05 
{
    public static void main(String[] args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        out.println("Enter a number");
        a=sc.nextInt();
        sc.close();
        if(a==1)
        out.println("Entered number: odd");
        else{
            while(a>=2)
            {
                a=a-2;
            }
        
        if(a==0)
        out.println("Entered number: even");
        else
        out.println("Entered number: odd");
        }
    }
    
}
