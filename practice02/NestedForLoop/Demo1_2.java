/*      1
        22
        333
*/ 


package practice02.NestedForLoop;
import static java.lang.System.out;

public class Demo1_2
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=i;j++)
            {
                out.print(i +" ");
            }
            out.println();
        }
    }
    
}
