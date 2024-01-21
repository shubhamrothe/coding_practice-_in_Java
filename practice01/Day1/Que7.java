/*Q7.	Accept a number from user - if it is divisible by 3 print “three” , if it is divisible by 7 print “seven” and if it is divisible by both(3,7) print “three -seven”*/
import static java.lang.System.out;
import java.util.*;
public class Que7 
{
    public static void main(String[] args)
    {
    int no;
    Scanner sc=new Scanner(System.in);
    out.println("Enter a numer");
    no=sc.nextInt();
    sc.close();
    if(no%3==0 && no%7==0)
    out.print("three-seven");
    else if(no%7==0)
    out.print("seven");   
    else if(no%3==0)
    out.print("three");
    }
}
