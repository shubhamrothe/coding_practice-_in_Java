/*  zyxyz    
     zyz
      z   */

import static java.lang.System.out;
public class Day3_5_12 
{
 public static void main(String[] args)
 {
    int i,j,r,s;
    for(i=120;i<=122;i++)
    {
      for(s=i;s>120;s--)
      out.print(" ");
      for(j=122;j>=i;j--)
      out.print((char)j);
      for(r=i+1;r<=122;r++)
      out.print((char)r);
      out.println();
    } 
 }
}



