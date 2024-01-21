import static java.lang.System.out;
import java.util.*;
public class Day2_17
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter a number and a digit");
        int n=sc.nextInt();
        int d=sc.nextInt();
        int rem,count=0;
        while(n>0)
        {
            rem=n%10;
            if(rem==d)
                count++;
            n=n/10;
        }
        out.print("Occurence of digit="+count);
    }
}
