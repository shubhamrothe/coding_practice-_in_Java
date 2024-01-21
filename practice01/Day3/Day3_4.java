
/*  Accept a number from user and print table till that number  */
      
import static java.lang.System.out;
import java.util.*;
public class Day3_4
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      out.print("Enter a number");
      int no,ans;
      no=sc.nextInt();
      int i,j;
        for(i=1;i<=10;i++)
        {
            for(j=1;j<=no;j++)
          {
             ans=i*j;
             out.print(i+ "*" + j + "=" + ans+" ");
          }
          out.println(" ");
       }
       out.println();
    } 
}


