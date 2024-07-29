//package practice02.String;
import java.util.*;
import static java.lang.System.out;

public class CountOcurrenceOfWord 
{
    // public static void main(String[] args) {   
    //     Scanner sc = new Scanner(System.in);
    //     out.println("Enter a sentence");
    //     String sentence = sc.nextLine();
    //     out.println("Enter a word");
    //     String word = sc.next().toLowerCase(); // Convert the target word to lowercase
    //     String[] words = sentence.split(" ");
    //     int count = 0;
    //     for (String w : words) 
    //     {
    //         // Convert the current word to lowercase for case-insensitive comparison
    //         String lowerCaseWord = w.toLowerCase();

    //         // Check if the lowercase word contains the target word
    //         if (lowerCaseWord.contains(word)) {
    //             count++;
    //         }
    //     }

    //     out.println("The word '" + word + "' found " + count + " times.");
    // }



    // public static void main(String[] args)
    // {
    //     Scanner sc=new Scanner(System.in);
    //     out.println("Enter a sentence");
    //     String Sentence=sc.nextLine();
    //     out.println("Enter a word");
    //     String word=sc.next().toLowerCase();
    //     String[] words=Sentence.split(" ");
    //     int count=0;
    //     for(String w: words)
    //     {
    //         String Lowercaseword=w.toLowerCase();
    //         if(Lowercaseword.contains(word))
    //         {
    //             count ++;
    //         }
    //     }
    //     out.println("The word "+ word + " contains " + count + " no of times");
    // }


    public static int countOccurrences(String inputString) {
        return inputString.toLowerCase().split("is", -1).length - 1;
    }

    public static void main(String[] args) {
        String inputStr = "This is a sample string. Is it working as expected? Yes, it is.";
        int result = countOccurrences(inputStr);
        System.out.println(result);  // Output: 3
    }






}











// public class CountOcurrenceOfWord {
// public static void main(String[] args) {   
//     Scanner sc = new Scanner(System.in);
//     out.println("Enter a sentence");
//     String sentence = sc.nextLine();
//     out.println("Enter a word");
//     String word = sc.next().toLowerCase(); // Convert the target word to lowercase

//     // Remove punctuation marks and split the sentence into words
//     String[] words = sentence.replaceAll("[^a-zA-Z\\s]", "").split(" ");
//     int count = 0;

//     for (String w : words) {
//         // Convert the current word to lowercase for case-insensitive comparison
//         String lowerCaseWord = w.toLowerCase();

//         // Check if the lowercase word matches the target word
//         if (lowerCaseWord.equals(word)) {
//             count++;
//         }
//     }

//     out.println("The word '" + word + "' found " + count + " times.");
// }








    

