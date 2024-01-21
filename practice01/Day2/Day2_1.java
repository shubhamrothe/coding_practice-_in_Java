import static java.lang.System.out;
import java.util.*;
public class Day2_1 
{
    /*public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,sum=0;
        for(i=0;i<10;i++)
        {
            out.println("Enter a number");
            int n=sc.nextInt();
            sum=sum+n;
        }
        out.println("sum of numbers="+sum);
        sc.close();
    }*/
    //sc.close();

    public static void main(String[] args)
    {
        //int a=5,b=55,c=4;
        Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
        
         int big;
         //big=(a>b)?((b>c)?a:(c>a)?c:a):(b>c)?b:c;
          big=(a>b?(a>c?a:c):(b>c?b:c));
        
            System.out.println("max="+big);
        
       /*  if(a>b)
        {
            if(a>c)
            out.println("Max="+a);
            else
            out.println("max="+c);

        }
        else
        {
            if(b>c)
            out.println("Max="+b);
            else
            out.println("Max="+c);
        }*/
    }
    
}
