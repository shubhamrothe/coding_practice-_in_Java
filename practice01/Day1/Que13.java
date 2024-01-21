import java.util.*;
public class Que13 
{
    public static void main(String[] args)
    {
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        sc.close();
        System.out.println("The sides are:"+a  +b   +c  +d);
        if(a<=(b+c+d)&&b<=(a+c+d)&&c<=(a+b+d)&&d<=(a+b+c))
        { 
          //System.out.println("The sides can be used to create a polygon");
          System.out.println("polygon status:1");
        }
        else
        System.out.println("polygon status:0");
        if(a==b&&b==c&&c==d)
        {
         //System.out.println("The polygon is square");
         System.out.println("square status:1");
        }
        else
        System.out.println("square status:0");
    }    
}
