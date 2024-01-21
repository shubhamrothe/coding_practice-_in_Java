import static java.lang.System.out;
import java.util.*;
public class Day3_12
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      out.print("Enter a number");
      int no;
      no=sc.nextInt();
      int a=no,count=0;
      while(count<a)
      { int n;   
         no++=n;
        for(int i=2;i<a;i++ )
        {
           if(n%i==0)
              {  n++;
                break;
            }                           
        }
        out.print(n);
        count++;
       }
    }
    
}
