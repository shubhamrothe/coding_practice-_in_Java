package practice02.String;
import static java.lang.System.out;
import java.util.*;
public class CopyString 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter a string");
        String str=sc.next();
        char[] ch=str.toCharArray();
        int j=0;
        char[] cp=new char[10];
        for(char c:ch)
        {   out.print(c+" ");
            cp[j++]=c;}
            out.println();
        String str2=String.valueOf(cp);
        out.print("Value of str2 is" +str2);
    }
    
}
