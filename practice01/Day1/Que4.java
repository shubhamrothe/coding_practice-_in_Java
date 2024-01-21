/*Q4.	Accept a character from user and reverse the case eg. Input a out put   A*/
import static java.lang.System.out;
import java.util.*;
public class Que4
{
    public static void main(String[] args)
    {
        char c;
        Scanner sc=new Scanner(System.in);
        out.println("Enter a characture");
        c=sc.next().charAt(0);
        sc.close();
        int n=(int)(c);
        if(n>=65&&n<=90)
        c=(char)(c+32);
        else if(n>=97&&n<=122)
        c=(char)(c-32);
        else
        out.println("No valid characture");
        out.println(c);
    } 
}
