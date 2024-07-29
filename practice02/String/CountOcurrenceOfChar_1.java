package practice02.String;
import java.util.*;
import static java.lang.System.out;

public class CountOcurrenceOfChar_1 
{
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        out.println("Enter a string");
        String str1 = sc.next();
        out.println("Enter a character");
        char ch = sc.next().charAt(0);
        char[] ch1 = str1.toCharArray();
        int l = ch1.length;
        int i,count = 0;
        
        for (i = 0; i < l; i++) {
            if (ch1[i] == ch) { 
                count++;
            }  
        }
        if(count==0)
        {
             out.print("Characture not found ");
        }
        else
            out.println("Characture found"+" "+count+" "+ "times");
    }
}



    

