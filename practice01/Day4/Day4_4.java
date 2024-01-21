package Day4;
import static java.lang.System.out; 
import java.util.*;
public class Day4_4 
{
    public static void main(String[] args)
    {
        String choice;
        int a=0,b=0;
        out.println("Enter a coice 1:addition\n 2:multiplication\n 3:division\n 4:exit");
        Scanner sc=new Scanner(System.in);
        choice=sc.next();
    
    switch(choice)
        {
            default:
                    out.print("Enter a valid choice");
            case "1":
                     out.print("Enter value of a and b");
                     a=sc.nextInt();
                     b=sc.nextInt();
                     int Addition;
                      Addition=a+b;
                      out.print("Addition of values ="+Addition);
                     break;
            case "2":
                     out.print("Enter value of a and b");
                     a=sc.nextInt();
                     b=sc.nextInt();
                     int Multiplication;
                     Multiplication=a*b;
                     out.println("Multiplication of values="+Multiplication); 
                        break;
            case "3":
                     out.print("Enter value of a and b");
                     a=sc.nextInt();
                     b=sc.nextInt();
                     int division;
                     division=a/b;
                     out.println("Division of values ="+division);
                        break;
             case "4":
                    out.print("Exit switch case");              
        }
    }
    
}
