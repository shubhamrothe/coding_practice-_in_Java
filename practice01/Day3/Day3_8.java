/*  Accept a number from user and check if it is prime no.or not  */
      
      import static java.lang.System.out;
      import java.util.*;
      public class Day3_8
      {
          public static void main(String[] args)
          {
            Scanner sc=new Scanner(System.in);
            out.print("Enter a number");
            int no;
            int i,flag=0;
            no=sc.nextInt();
            sc.close();
              for(i=2;i<=no/2;i++)
              {
                if(no%i==0)
                {
                   flag=1;
                   break;
                }
             }
                if(flag==1)
                   out.print("Entered number is not a prime no");
                else
                  out.print("Entered number is prime no");
          } 
      }
    

