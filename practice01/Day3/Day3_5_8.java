
/*     1
      121
     12321
      121
       1      */
       
import static java.lang.System.out;
public class Day3_5_8 {
    public static void main(String[] args)
    {
        for(int i=1;i<=3;i++)
        {
            for(int s=i;s<3 ;s++ )
            out.print(" ");
            for(int j=1;j<=i;j++)
            out.print(j);
            //out.println();
            for(int k=i-1 ;k>=1 ;k--)
            out.print(k);
            out.println();
        }
         for(int i=2;i>=1;i--)
         {
            for(int s=i;s<=2;s++)
           out.print(" ");
            for(int j=1;j<=i;j++)
            out.print(j);
            //if(i==2)
            //out.print(i-1);
            for(int k=1;k<=i-1;k++)
            out.print(k);
            out.println();
         }
    }
}
  
