package practice02.String;


public class DEmo122222 {

 public static void main(String[] args) {
    int a,b;
    a=5;
     b=2;
    float c=( float)a/b;
    // System.out.println(c);//2.5
     System.out.println(count("welcome to DAC DBDA"));
     }
    
    public static int count(String word)
    { 
     if (word == null || word.isEmpty()) 
     { return 0; 
     } 
     int wordCount = 0; 
     boolean isWord = false;
     int endOfLine = word.length() - 1;
    char[] characters = word.toCharArray();
     for (int i = 0; i < characters.length; i++)
    { // if the char is a letter, word = true.
    if (Character.isLetter(characters[i]) && i != endOfLine)
    { isWord = true; 
     // if char isn't a letter and there have been letters before, // counter goes up.
    } 
    else if (!Character.isLetter(characters[i]) && isWord)
     { wordCount++; isWord = false;
    // last word of String; if it doesn't end with a non letter, it // wouldn't count without this. 
     } 
     else if (Character.isLetter(characters[i]) && i == endOfLine) 
     { wordCount++; 
 } 
     } 
     return wordCount; 
     }
    }