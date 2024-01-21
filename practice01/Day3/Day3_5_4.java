/*    1
      2 3
      4 5 6     */
      
      import static java.lang.System.out;                     //
      public class Day3_5_4
      {
        public static void main(String[] args)
        {
              int i, j;
              int n=1;
              for(i=1;i<=3;i++)
              {
               for(j=1;j<=i;j++)
               {
                   out.print(n);
                   n++;
               }
               out.println();
              }   
         }
        }
      