// Q3. Accept a number from user, if it is divisible by 3 print “three”, if it is divisible by 7 print “seven” and if it is
// divisible by both (3 &7) print “three-seven”

package practice02.If;
import java.util.*;
import static java.lang.System.out;
public class Demo03 
{
    public static void main(String[] args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        out.println("Enter a number");
        a=sc.nextInt();
        sc.close();
        if(a%3==0&&a%7==0)
        out.println("three-seven");
        else if(a%3==0)
        out.println("three");
        else if(a%7==0)
        out.println("seven");
        else
        out.println(" Entered number is not divisible by 3,7 and both ");

    }
}
