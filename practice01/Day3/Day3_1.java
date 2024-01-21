import static java.lang.System.out;
public class Day3_1
{
    public static void main(String[] args)
    {
      for(int i=1;i<=200000;i++)
       {
        int no=i;
        boolean r=isspecial(no); 
         if(r==true)
         out.print(no+" ");
        }
    }

    public static boolean isspecial(int no)
    {
        int r,n,sum=0;
        n=no;
        while(no!=0)
        {
           r=no%10;
           sum=sum+factorial(r);
           no=no/10;
        }
        if(sum==n)
        return true;
        return false;
    }
    public static int factorial(int n)
    {
        int i,fact=1;
        for(i=2;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    } 
}




