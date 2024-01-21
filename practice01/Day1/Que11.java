import static java.lang.System.out;
import java.util.*;
public class Que11 
{
    public static void main(String[] args)
    {
        int no,r1,r2,r3;
      // int no;
        Scanner sc=new Scanner(System.in);
        out.println("Enter a three digit numer");
        no=sc.nextInt();
        sc.close();      
         r1=no%10;
        no=no/10;
        r2=no%10;
        no=no/10;
        r3=no%10;
        no=no/10;
        out.println("Sum="+(r1+r2+r3));
        //using loop
       /*
       int sum=0;
        while(no>0)
        {
            sum=sum+no%10;
            no=no/10;

        }
        out.println("sum="+ sum);*/
    }
    
}
