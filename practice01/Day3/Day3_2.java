/* Print all armstrong number between 100 to 999 */

import static java.lang.System.out;
public class Day3_2
{
    public static void main(String[] args)
    {
        //int i=100;
        //while(i<1000 )
        for(int i=100;i<=999;i++)
        {
          int n=i;
        int rem,sum=0,cube;
        while(n!=0)
        {
            rem=n%10;
            cube=rem*rem*rem;  
            sum=sum+cube;
            n=n/10;
        }
        if(sum==i)
        out.print(i+" ");
        //i++;
        }
    }
}





