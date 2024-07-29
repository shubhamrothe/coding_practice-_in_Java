                //   1 
                //  2 2
                // 3 3 3
package practice02.NestedForLoop;
import static java.lang.System.out;

public class Demo1_3
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=1;i<=3;i++)
        {
            for(int s=3  ;s>i  ;s--  )
            {
                out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                out.print(i+" ");
            }
            out.println();
        }
    }   
}
