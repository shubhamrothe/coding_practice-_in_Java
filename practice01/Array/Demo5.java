package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo5
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        System.out.println("Enter 5 elements for array 1:");
        for (int i = 0; i < 5; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter 5 elements for array 2:");
        for (int i = 0; i < 5; i++) {
            array2[i] = scanner.nextInt();
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        int[] mergedArray = new int[10];
        int i = 0, j = 0, k = 0;

        // Merge sorted arrays
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        System.out.println("Merged and sorted array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

