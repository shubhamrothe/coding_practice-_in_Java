package practice02.String;
import java.util.*;
import static java.lang.System.out;
public class CheckNameFoundOrNot_8 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("Enter 5 names:");
        String[] names = new String[5];
        for (int i = 0; i < 5; i++) {
            names[i] = sc.next();
        }
        
        out.println("Enter a name to check");
        String ss=sc.next();
        int flag=0;
        for(String n:names)
        {
            if(n.equals(ss))
            {
                flag=1;
            }
        }
        if(flag==1)
        out.println(" name found");
        else out.println("name not founnd ");
    }


    
}
