import static java.lang.System.out;
public class Day3_5_16 
{
    public static void main(String[] args)
    {    int row=3;
         for(int i=0;i<=row-1;i++)
         {
            for(int s=row-1-i;s>0;s--)
            out.print("_");
            out.print("*");
            for(int midspace=0;midspace<i*2;midspace++)
            out.print("_");
            out.print("*");
            for(int s=row-1-i;s>0;s--)
            out.print("_");
            out.println();
         }
    }
}
    

