//Q.1 Accept 10 numbers from user and do sum of it.(do not use array)
package practice02.Loop;
import java.util.*;
import static java.lang.System.out;
public class Demo01 
{
    public static void main(String[] args)
    {
         int sum;
         int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
         Scanner sc=new Scanner(System.in);
         out.println("Enter 10 numbers");
        a1=sc.nextInt();
        a2=sc.nextInt();
        a3=sc.nextInt();
        a4=sc.nextInt();
        a5=sc.nextInt();
        a6=sc.nextInt();
        a7=sc.nextInt();
        a8=sc.nextInt();
        a9=sc.nextInt();
        a10=sc.nextInt();
        sc.close();
        sum=a1+a2+a3+a4+a5+a6+a7+a8+a9+a10;
        out.println("sum="+ sum);
    }
    
}
