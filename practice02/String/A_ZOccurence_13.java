package practice02.String;
//import static java.lang.System.out;
import java.util.*;
public class A_ZOccurence_13 {
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the paragraph (terminate with '#'):");
        // Read the paragraph until '#' is encountered
        StringBuilder paragraph = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).equals("#")) {
            paragraph.append(line);
            paragraph.append('\n'); // Add newline character for each line
        }

        // Create an array to hold the count of occurrences for each alphabet
        int[] alphabetCount = new int[26]; // 'a' to 'z'

        // Convert the paragraph to lowercase and count alphabet occurrences
        String lowerCaseParagraph = paragraph.toString().toLowerCase();
        for (int i = 0; i < lowerCaseParagraph.length(); i++) 
        {
            char c = lowerCaseParagraph.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabetCount[c - 'a']++;
            }
        }
    }
}
