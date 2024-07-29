package practice02.String;
import static java.lang.System.out;
import java.util.*;

public class DeleteChar_9 {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        out.println("Enter a string");
        String str1 = sc.next();
        int i, k, flag = 0;
        out.println("Enter a character");
        char ch = sc.next().charAt(0);
        char[] ch1 = str1.toCharArray();
        int l = ch1.length;
        
        for (i = 0; i < l; i++) {
            if (ch1[i] == ch) { 
                flag=1;
                for (k = i; k < l - 1; k++) {  
                    ch1[k] = ch1[k + 1];
                }
                i--; // Decrement i to recheck the current index after shifting
                l--;
            }
            
        }
        if(flag==1)
        {
        // Printing the modified string
        out.print("Modified string: ");
        for (i = 0; i < l; i++) {
            out.print(ch1[i]);
        }
        }
        else
            out.println("Characture not found");
    }
}
