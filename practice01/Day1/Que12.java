import static java.lang.System.out;
import java.util.*;
public class Que12 
{
    public static void main(String[] args)
    {
        int T,p;
        double I,R;
        Scanner sc=new Scanner(System.in);
        out.println("Enter the principal and interest rate per year and time in year");
        p=sc.nextInt();
        //out.println("Enter the simple interest rate per year");
        R=sc.nextDouble();
        //out.println("Enter the time in year");
        T=sc.nextInt();
        I=(p*R*T)/100;
        out.println("Simple Interest="+I);
        sc.close();
    }   
}
