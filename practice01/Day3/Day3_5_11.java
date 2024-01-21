/*    0
     101
    21012     */
      
     import static java.lang.System.out;
    public class Day3_5_11
    {
        public static void main(String[] args)
        {
            int i,s,r, j;
            for(i=0;i<=2;i++)
            {
              for(s=i;s<=1;s++)
              out.print(" ");
              for(j=i;j>=0;j--)
                 out.print(j);
              for(r=1;r<=i;r++)
             out.print(r);
             out.println();
            } 
        }
    }




 /*import static java.lang.System.out;
 public class Day3_5_11
 {
     public static void main(String[] args)
     {
         int i,s,j,k;
         for(i=0;i<=2;i++)
         {
            for(s=i;s<2;s++)
            out.print(" ");
            for(j=i;j>=0;j--)
            out.print(j);
            for(k=1;k<i+1;k++)
            out.print(k);
            out.println();
        }
    }
}*/

