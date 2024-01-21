/*   a
     ab
     abc  */
     
public class Day3_5_13 
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=97;i<=99;i++)
        {
            for(j=97;j<=i;j++)
            System.out.print((char)j);
            System.out.println();
        }
    }   
}

