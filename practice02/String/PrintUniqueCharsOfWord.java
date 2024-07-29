
//Accept a word from user and print unique charactures

package practice02.String;
import java.util.*;
import static java.lang.System.out;
public class PrintUniqueCharsOfWord 
{
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        out.println("Enter a word");
        String word = sc.next();
        char[] ch=word.toCharArray();
        int l=ch.length;
        sc.close();
        boolean[] visited = new boolean[256];
        for(int i=0;i<l;i++)
        {
            if (!visited[ch[i]]) {
                out.print(ch[i] + " ");
                visited[ch[i]] = true;
            }
        }
    }
    
}
