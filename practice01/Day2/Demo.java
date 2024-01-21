import static java.lang.System.out;
import java.util.*;

public class Demo {
    public static void main(String[] args)
    {
        int n,reverse=0;
        Scanner sc=new Scanner(System.in);
        out.println("Enter a number");
        n=sc.nextInt();
        sc.close();
        while(n!=0)
        {
            reverse=reverse*10;
            reverse=reverse+(n%10);
            n=n/10;
        }
        out.println("Reverse of entered number:"+reverse);
    }
    
}
