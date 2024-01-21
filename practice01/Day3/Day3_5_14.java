/*    *
     * *
    * * * 
   * * * *    */
      
    import static java.lang.System.out;
    public class Day3_5_14
    {
        public static void main(String[] args)
        {
          int i,s,j;
          for(i=4;i>=1;i--)
          {
            for(s=4;s<i;s++)                                //for(s=4-1;s>1;s--)
            out.print(" ");
            for(j=i;j>=1;j--)
           out.print("*"+ " ");
           out.println();
           }

        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*{
            int i,s,j;
            for(i=0;i<4;i++)
            {
              for(s=3;s>=i;s--)                                //for(s=4-1;s>1;s--)
              out.print(" ");
              for(j=0;j<=i;j++)
             out.print("*"+ " ");
             out.println();
             }
        } */
      }
      


