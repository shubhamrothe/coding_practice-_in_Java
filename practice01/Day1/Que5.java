/*Q5.	Accept a character from user and check if it is vowel or not*/

import static java.lang.System.out;
import java.util.*;
public class Que5 
{ 
    public static void main(String[] args)
    {   
        char c;
        Scanner sc=new Scanner(System.in);
        out.println("Enter a characture");
        c=sc.next().charAt(0);
        sc.close();
        if(c=='a'|| c=='A' || c=='e'|| c=='E' || c=='i'|| c=='I'|| c=='o'|| c=='O' || c=='u'|| c=='U' )
        out.println("the characture is wovel");
        else
        out.println("the characture is not wovel");

    }   
}
