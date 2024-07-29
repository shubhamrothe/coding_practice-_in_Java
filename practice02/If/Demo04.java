//Q4. Accept a number from user check if it is odd or even number

package practice02.If;
import java.util.*;
import static java.lang.System.out;
public class Demo04 
{
    public static void main(String[] args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        out.println("Enter a number");
        a=sc.nextInt();
        sc.close();
        if(a%2==0)
        out.println("Entered number: even");
        else
        out.println("Entered number: odd");
    }
    
}
