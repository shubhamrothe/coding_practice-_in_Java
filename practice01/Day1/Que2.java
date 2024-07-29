/*Q2.	Accept three no and find out the highest  no.*/

import static java.lang.System.out;
import java.util.*;
public class Que2 
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        out.println("Enter three numers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sc.close();
        // if(a>b)
        // {
        //     if(a>c)
        //     out.println("Highest no"+a);
        //     else
        //     out.println("Highest no"+c);
        // }
        // else
        // {
        //     if(b>c)
        //     out.println("Highest no"+b);
        //     else
        //     out.println("Highest no"+c);
        // }


        int x= (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(x);

    }  
}
