/*Q8.	An electric power distribution co. charges its domestic consumers as follows
follows: consumption units
a.	0-200			            0.50 perunit
b.	201-400			100+0.65 pu.excess of 200
c.	401-600			230+0.80pu.excess of 400
d.	601 and above	390+1.00pu in excess of 600
*/
import static java.lang.System.out;
import java.util.*;

/*public class Que8{

    public static void main(String[] args)
    {
        double c,charge,Amount;
        int u;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter te units");
        u=sc.nextInt();
        sc.close();
        if(u>=0 && u<=200)
        {
            c= 0.5;
            charge=c*u;
        }
        else if(u>200 && u<=400)
        {
            c=0.65 ;
            charge=100+((u-200)*c);
        }
        else if(u>400 && u<=600)
        {
            c= 0.8;
            charge=230+((u-400)*c);
        }
        else 
        {
            c= 1.0;
            charge=390+((u-600)*c);
        }
        Amount=u*charge;
        System.out.println("Amount="+ Amount);
    }
}*/
public class Que8 
{
    public static void main(String[] args)
    {
        double c,charge;
        int u;
        Scanner sc=new Scanner(System.in);
        out.println("Enter the no of units");
        u=sc.nextInt();
        sc.close();
        //c=sc.nextDouble();
        if(u>=0 && u<=200)
        {   c=0.50;
            charge=u*c;
            out.println("Amount="+charge);

        }
        else if(u>=201 && u<=400)
        {   c=0.65;
            charge=100+(u-200)*c;
            out.println("Amount="+charge);}
        else if(u>=401 && u<=600)
        {   c=0.8;
            charge=230+(u-400)*c;
            out.println("Amount="+charge);}
        else 
        {
            c=1;
            charge=390+(u-600)*c;
            out.println("Amount="+charge);}
    }  
}
