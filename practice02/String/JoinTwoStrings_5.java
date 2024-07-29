package practice02.String;
import static java.lang.System.out;
import java.util.*;
public class JoinTwoStrings_5 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter two strings");
	    String str1=sc.next();
        String str2=sc.next();
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        char[] ch3=new char[20];
        int i,j,k=0;
        for(i=0;i<ch1.length;i++)
        {
            ch3[k++]=ch1[i];
           // k++;
        }
        ch3[k++]=' ';
        for(j=0;j<ch2.length;j++)
        {
            ch3[k++]=ch2[j];
           // k++;
        }

        String ss=String.valueOf(ch3);
        out.print(ss);
       
    }
    
}
