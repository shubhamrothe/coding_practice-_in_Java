public class Day3_5_17 
{  
    public static void main(String[] args)
    {
        int i,j,s;
        for(i=1;i<=3 ;i++)
        {
            for(s=i;s<=2;s++)
            System.out.print(" ");
            for(j=1;j<(i+i);j++)
            {if(j%2!=0)
            System.out.print(1);
            else
            System.out.print(2);}
            System.out.println();
        }
    }
}