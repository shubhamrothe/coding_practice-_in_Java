import static java.lang.System.out;
      import java.util.*;
      public class Day3_9
      {
          public static void main(String[] args)
          {
            Scanner sc=new Scanner(System.in);
            out.print("Enter first number and second number");
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int HCF=0;
              for(int i=1;i<=n1||i<=n2;i++)
              {
                if(n1%i==0 && n2%i==0)
                {
                   HCF=i;
                }
             }
            out.print("HCF of two numers is:"+HCF);
          } 
      }