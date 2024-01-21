
//Logic 1
import static java.lang.System.out;
import java.util.*;
public class Day2_13 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter start range and end range");
        int sr=sc.nextInt();
        int er=sc.nextInt();
        for(int no=sr;no<=er;no++)
        {
            if(no%2==0)
            out.print(no);
            out.print(" ");
        }
    }
}  

//logic 2

/*import static java.lang.System.out;
import java.util.*;
public class Day2_13 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter start range and end range");
        int sr=sc.nextInt();
        int er=sc.nextInt();
        for(int no=sr;no<=er;no++)
        {
            if(no/2*2==no)
            out.print(no);
            out.print(" ");
        }
    }
} */

