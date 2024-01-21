/*    1
      21
      321     */
      
      import static java.lang.System.out;
      public class Day3_5_6
      {
          public static void main(String[] args)
          {
              int i, j;
              for(i=1;i<=3;i++)
              {
               for(j=i;j>=1;j--)
                   out.print(j);
               out.println();
              } 
          }
      }

