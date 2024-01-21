package Day4;
import static java.lang.System.out;
import java.util.*;
public class Day4_2
{
    public static void main(String[] args)
    {
        String choice;
        int side=0;
        out.print("Enter a choice a:square\n b:cube\n c:exit");
        Scanner sc=new Scanner(System.in);
        choice=sc.next();
        //if("a".equals(c)||"A".equals(c)||"b".equals(c)||"B".equals(c)||"c".equals(c)||"C".equals(c))
        //{
            out.println("Enter a side");
            side=sc.nextInt();
       // }
        switch(choice)
        {
            default:
                    out.println("Enter a valid choice");
            case "a":
            case "A":
                     //out.print("Enter a side");
                     //side=sc.nextInt();
                      int square;
                      square=side*side;
                      out.println(square);
                     //break;
            case "b":
            case "B":    
                       //out.print("Enter a side");
                       //side=sc.nextInt();
                       int cube;
                       cube=side*side*side;
                       out.println(cube); 
                       // break;
            case "c":
            case "C":
                        break;   
        }
        //else
        //out.print("Enter a valid choice");

    }
}
    


