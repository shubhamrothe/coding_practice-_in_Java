package Array;
//import static java.lang.System.out;
import java.util.*;
public class ExtarctElements 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int[] originalArray = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) 
        {
            originalArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the number of elements to extract: ");
        int numToExtract = scanner.nextInt();

        if (startIndex >= 0 && startIndex < originalArray.length && numToExtract > 0) 
        {
            int[] extractedArray = extractFromArray(originalArray, startIndex, numToExtract);

            System.out.println("Extracted elements:");
            printArray(extractedArray);
        } 
        else 
        {
            System.out.println("Invalid input.");
        }

        scanner.close();
    }

    public static int[] extractFromArray(int[] arr, int startIndex, int numToExtract) 
    {
        int[] extractedArray = new int[numToExtract];

        for (int i = 0; i < numToExtract; i++) 
        {
            if (startIndex + i < arr.length) 
            {
                extractedArray[i] = arr[startIndex + i];
            }
        }

        return extractedArray;
    }

    public static void printArray(int[] arr) 
    {
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


