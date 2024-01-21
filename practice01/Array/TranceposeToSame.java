package Array;
import static java.lang.System.out;	 
import java.util.*;
public class TranceposeToSame {
public static void main(String[] args) { 
int[][] a={{1,2,3},{4,5,6},{7,8,9}};
int[][] b=new int[3][3];
int i,j;	
int t;
  for(i=0;i<3;i++)
  {
     for(j=i+1;j<3;j++)
 {      
    	   t=a[i][j];
    	   a[i][j]=a[j][i];
    	   a[j][i]=t;
   }
}
for(i=0;i<3;i++)	
{
 for(j=0;j<3;j++)
{out.print(a[i][j]);
}
   out.print("\n");
   }

}
}