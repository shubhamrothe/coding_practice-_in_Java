
import static java.lang.System.out;
import java.util.*;
public class Que9 
{
    public static void main(String[] args)
    {
        int no;
        Scanner sc=new Scanner(System.in);
        out.println("Enter a numer");
        no=sc.nextInt();
        sc.close();
        //logic: 1
        // if(no/2*2==no)
        // out.println("Entered numer is even");
        // else
        // out.println("Entered numer is odd");

       /* //Logic :2
       if(no==1)
            out.println("Entered numer is odd");
       if(no%2==0)
            out.println("Entered numer is even");
        else
            out.println("Entered numer is odd");*/

            //Logic : 3
        // int r=no&1;//(100&001)
		// if(r==0)
		// 	out.print("even number");
		// else 
		//  out.print("odd");

        //Logic : 4
        while(no>2)
		{
		  no  =  no-2;
        }
		if(no==2)
			
			out.print("even number");
		else 
		 out.print("odd");
        
    }  
}
