package Array;
import static java.lang.System.out;

import java.util.*;

public class TranceposeToAnother 
{
public static void main(String[] args) {   

int[][] a={{1,2,3},{4,5,6},{7,8,9}};
int[][] b=new int[3][3];
int i,j;
  for(i=0;i<3;i++)
  {
     for(j=0;j<3;j++)
 {      
      b[j][i]  =  a[i][j];

   }
}
for(i=0;i<3;i++)	
{
 for(j=0;j<3;j++)
{out.print(b[i][j]);
}
   out.print("\n");
   }

}
}
