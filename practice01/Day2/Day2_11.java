import static java.lang.System.out;
import java.util.*;
public class Day2_11
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=5;i>=1;i--)
        {
            out.print(++n);
            out.print(" ");
        }
    }
}
