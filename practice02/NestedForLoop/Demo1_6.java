    // 1 
    // 2 1
    // 3 2 1

package practice02.NestedForLoop;
import static java.lang.System.out;

public class Demo1_6
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=1;i<=3;i++)
        {
            for(j=i;j>=1;j--)
            {
                out.print(j +" ");
            }
            out.println();
        }
    }
    
}
