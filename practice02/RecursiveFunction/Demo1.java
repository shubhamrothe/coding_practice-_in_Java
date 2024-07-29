package practice02.RecursiveFunction;
import static java.lang.System.out;
//import java.util.*;
public class Demo1 
{
    public static void main(String[] args)
    {
        
        int no=4;
         int y=fact(no);
        out.print(y+" ");
    }
    public static int fact(int n)
    {
        int f;
        if(n==1||n==0 )
        return 1;
        else
        {
            f=n*fact(n-1);
        }
        return f;
    }
    
}
