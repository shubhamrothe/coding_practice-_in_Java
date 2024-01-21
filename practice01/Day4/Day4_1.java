package Day4;
import static java.lang.System.out;
import java.util.*;
public class Day4_1 
{
    public static void main(String[] args)
    {
        String c;
        int side=0;
        out.print("Enter a choice s:square\n c:cube\n e:exit");
        Scanner sc=new Scanner(System.in);
        c=sc.next();
       // if("s".equals(c)||"S".equals(c)||"c".equals(c)||"C".equals(c)||"E".equals(c)||"e".equals(c))
        //{
            //out.print("Enter a side");
            //side=sc.nextInt();
        //}
        switch(c)
        {
            default:
                    out.print("Enter a valid choice");
            case "s":
            case "S":
                     out.print("Enter a side");
                     side=sc.nextInt();
                      int square;
                      square=side*side;
                      out.print(square);
                     break;
            case "c":
            case "C":    
                       out.print("Enter a side");
                       side=sc.nextInt();
                       int cube;
                       cube=side*side*side;
                       out.print(cube); 
                        break;
            case "e":
            case "E":
                     out.print("Exit switch case");
                     //break;   
        }
    }
}
    

