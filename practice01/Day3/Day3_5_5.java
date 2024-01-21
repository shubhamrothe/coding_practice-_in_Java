/*      1
       12
      123     */
      
      import static java.lang.System.out;
      public class Day3_5_5
      {
          public static void main(String[] args)
          {
              int i,s,j;
              for(i=1;i<=3;i++)
              {
               for(s=i;s<=2;s++)
                out.print(" ");
               for(j=1;j<=i;j++)
                   out.print(j);
               out.println();
              } 
          } 
      }

