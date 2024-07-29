//
import java.util.*;
import static java.lang.System.out;
public class ExtractPorsion_10 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter a String");
        String OriginalString=sc.next();
        out.println("Enter starting Index");
        int StartingIndex=sc.nextInt();
        out.println("Enter no of charactures to extract");
        int NumberOfChar=sc.nextInt();
        int l=OriginalString.length();

       if(StartingIndex>=0 && StartingIndex < l)
       {
        int EndIndex=Math.min(StartingIndex + NumberOfChar, l);
        String ExtractedString=OriginalString.substring(StartingIndex,EndIndex);
        out.println("Extracted String is :" + ExtractedString);
       }
       else
       out.println("Invalid Starting index");
       sc.close();
    }
   
 }
    

