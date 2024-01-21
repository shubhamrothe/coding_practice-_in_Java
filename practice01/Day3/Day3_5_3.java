/*     1
      2 2
     3 3 3     */
      
      import static java.lang.System.out;
      public class Day3_5_3
      {
          public static void main(String[] args)
          {
            int i,s,j;
            for(i=1;i<=3;i++)
            {
                for(s=i;s<3;s++)
               // OR  for(s=2;s>=i;s--)                                  
                 out.print(" ");
            for(j=1;j<=i;j++)
                 out.print(i+" ");
             out.println();
            } 
         }
        }
      
    
    
    
      
          
      
