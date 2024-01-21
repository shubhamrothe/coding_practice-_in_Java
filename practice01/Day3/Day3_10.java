/*  Accept a number from user and check if it is prime no.or not  */
      
import static java.lang.System.out;
import java.util.*;
public class Day3_10
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      out.print("Enter first number and last number");
      int n1,n2;
      n1=sc.nextInt();
      n2=sc.nextInt();
      int count=0;
        for(int i=n1;i<=n2;++i)
        {
           int num=i;
           // check prime no
           boolean isPrime=true;
           for(int j=2;j<=num/2;j++)
           {
              if(num%j==0)
             {
               isPrime=false;
               break;
             }
           }
                if(isPrime==true)
                {
                  out.print(num+" ");
                  count++;
                }
        }
          out.print("Total count="+count);
   }
}
    


