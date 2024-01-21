/*  321
    32
    3     */

 import static java.lang.System.out;
 public class Day3_5_18
 {
     public static void main(String[] args)
     {
         int i, j;
         for(i=1;i<=3;i++)
         {
          for(j=3;j>=i;j--)
          {
              out.print(j);
          }
          out.println();
         } 
     }  
 }