/*    1
     121
    12321     */
      
      import static java.lang.System.out;
      public class Day3_5_7
      {
          public static void main(String[] args)
          {
              int i,s,r, j;
              for(i=1;i<=3;i++)
              {
                for(s=i;s<=2;s++)
                out.print(" ");
                for(j=1;j<=i;j++)
                 out.print(j);
                for(r=i-1;r>=1;r--)
               out.print(r);
               out.println();
              } 
          }
      }

