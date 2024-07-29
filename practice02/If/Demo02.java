
//Q2. Accept three numbers and find out the highest number.

package practice02.If;
import java.util.*;
import static java.lang.System.out;

public class Demo02 
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        out.println("Enter the three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sc.close();
        int y=a>b?(a>c?a:c):(b>c?b:c);
        out.println("Higest number :"+y);
    }
    
}
