package practice02.String;
import java.util.*;
import static java.lang.System.out;
public class CountNoOfWordsInSentense_4 
{
    public static void main(String[] args) 
    {
        String paragraph = "This is a sample paragraph. This paragraph contains the word sample multiple times.";
        String targetWord = "sample";
        
        int occurrences = countOccurrences(paragraph, targetWord);
        System.out.println("The word '" + targetWord + "' appears " + occurrences + " times.");
    }
    public static int countOccurrences(String para, String word) 
    {
        int paraLen = para.length(); 
        int wordLen = word.length(); 
        int wordCounter = 0; 
        int s = 0, i = 0; 
        
        while (s < paraLen) {
            if (s < paraLen && Character.toLowerCase(para.charAt(s)) == Character.toLowerCase(word.charAt(0))) 
            {
                // start matching 
                i = 0; 
                while (s < paraLen && i < wordLen && Character.toLowerCase(para.charAt(s)) == Character.toLowerCase(word.charAt(i))) {
                    s++; 
                    i++; 
                }
                
                if (i == wordLen) {
                    wordCounter++; 
                }
            }
            
            s++; 
        }
        
        return wordCounter;
    }
}
