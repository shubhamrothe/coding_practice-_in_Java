/*    1 1
       2
      3 3    */
      
    import static java.lang.System.out;
    public class Day3_5_19
    {
        public static void main(String[] args)
        {
            int i, j;
            for(i=1;i<=3;i++)
            {
              for(j=1;j<=3;j++)
                 if(i==j||(i==(4-j)))
              out.print(i);
              else
             out.print(" ");
             out.println();
             }
        } 
    }

