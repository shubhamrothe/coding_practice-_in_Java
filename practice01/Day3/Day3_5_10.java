/*    1
     222
    33333     */
      
    import static java.lang.System.out;
    public class Day3_5_10
    {
        public static void main(String[] args)
        {
            int i,s,r, j;
            for(i=1;i<=3;i++)
            {
              for(s=i;s<=2;s++)
              out.print(" ");
              for(j=1;j<=i;j++)
                 out.print(i);
              for(r=i-1;r>=1;r--)
             out.print(i);
             out.println();
            } 
        }
    }

