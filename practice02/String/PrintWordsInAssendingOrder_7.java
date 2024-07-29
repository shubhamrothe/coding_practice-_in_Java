
//Accept 5 names from user and print them in ascending order

package practice02.String;
import java.util.*;
import static java.lang.System.out;
public class PrintWordsInAssendingOrder_7 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("Enter 5 names:");
        String[] names = new String[5];
        for (int i = 0; i < 5; i++) {
            names[i] = sc.next();
        }
        sc.close();
        // Bubble sort algorithm
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    // Swap names[j] and names[j + 1]
                    String t = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = t;
                }
            }
        }
        
        out.println("Names in ascending order:");
        for (String n : names) {
            out.println(n);
        }
    }
}





