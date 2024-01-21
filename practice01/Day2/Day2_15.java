
import static java.lang.System.out;
import java.util.*;
public class Day2_15
{
    public static void main(String[] arg)
    {
        //Scanner sc=new Scanner(System.in);
        //out.println("Enter a number");
        //int N=sc.nextInt();
        /*int num1=0,num2=1,count=0;
        while(count<N)
        {
            out.print(num1+" ");
            int num3=num2+num1;
                num1=num2;
                num2=num3;
                count++;
        }*/

        int i,n1=0,n2=1,n3;
        int count=5;
        out.print(n1+" "+n2);
        for(i=2;i<count;i++)
        {
            n3=n1+n2;
            out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
