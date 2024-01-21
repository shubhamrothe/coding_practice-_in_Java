/*  32123
     323
      3    */

import static java.lang.System.out;
public class Day3_5_9 
{
    public static void main(String[] args)
 {
    int i,j,r,s;
    for(i=1;i<=3;i++)
    {
      for(s=i;s>1;s--)
      out.print(" ");
      for(j=3;j>=i;j--)
      out.print(j);
      for(r=i+1;r<=3;r++)
      out.print(r);
      out.println();
    } 
 }   
}
