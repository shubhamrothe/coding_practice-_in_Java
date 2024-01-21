import static java.lang.System.out;
//import java.io.*;
import java.util.*;
public class Day3_11 
{
    public static void main(String[] args)
    {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        out.print("Enter first and last value");
        n1=sc.nextInt();
        n2=sc.nextInt();
        out.print("The pairs of twin primes between"+n1+"and"+n2+"are");
        //for(int i=n1;i<n2;i++)
        //{
            if(CheckTwinPrimeNumber(n1,n2))
            out.println(n1+ " "+n2 +"is pair of twin prims");
            else
            out.println(n1+ " "+n2 +"is not pair of twin prims");

        //}
    } 
    static boolean CheckTwinPrimeNumber(int n1,int n2)
    {
        if(CheckPrimeNumber(n1) && CheckPrimeNumber(n2) && Math.abs(n1-n2)==2)
        return true;
        else
        return false;
    } 
    static boolean checkPrimeNumber(int n)
    {
         int i;
         int m=0;
         int flag=0;
         m=n/2;
         if(n==0||n==1)
         {return false;}
         else
         {
            for(i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    return false;
                }
            }
            if(flag==0)
            {return true;}
         }
            return false;
    }
}
    

