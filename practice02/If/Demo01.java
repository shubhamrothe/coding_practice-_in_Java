

//Q1. Swap 2 variable without using 3rd variable.(three answer) 

package practice02.If;
import java.util.*;
import static java.lang.System.out;

public class Demo01 
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        out.println("Enter the two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        out.println("Before swapping" +a + " " +b);
                //Logic: 1
        //  a=a+b;
        //  b=a-b;
        //  a=a-b;
                //Logic: 2
        // a=a*b;
        // b=a/b;
        // a=a/b;

                //Logic: 3
        a=a^b;
        b=a^b;
        a=a^b;
        out.println("after swapping" +a + " " +b);
    }
    
}

