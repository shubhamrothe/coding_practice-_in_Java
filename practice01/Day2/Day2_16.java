import static java.lang.System.out;
import java.util.*;
public class Day2_16 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter first and second number");
        int f=sc.nextInt();
        int s=sc.nextInt();
        int LCM,HCF=1;
        for(int i=1;i<=f && i<=s;i++)
        {
            if(s%i==0 && f%i==0)
            HCF=i;
        }
        LCM=(s*f)/HCF;
        out.print("LCM of two numers ="+LCM);
    }
}

