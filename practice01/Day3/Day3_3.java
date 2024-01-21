/*  Accept a number from user and print table till that number  */
      
import static java.lang.System.out;
import java.util.*;
public class Day3_3
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      out.print("Enter a number");
      int no,ans;
      no=sc.nextInt();
      int i,j;
        for(i=1;i<=no;i++)
        {
            for(j=1;j<=10;j++)
          {
             ans=i*j;
             out.println(i+ "*" + j + "=" + ans);
          }
       }
    } 
}


