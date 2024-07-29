package practice02.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseFibonacci {
    //time complexity=O(n)
    public static void main(String[] args) {
        int n = 10; // You can change 'n' to any desired number of Fibonacci numbers you want to generate.

        List<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(0); // Start with the first Fibonacci number.
        fibonacciNumbers.add(1); // Second Fibonacci number.

        // Generate the Fibonacci numbers in reverse order.
        for (int i = 2; i < n; i++) {
            int nextFibonacci = fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2);
            fibonacciNumbers.add(nextFibonacci);
        }

        // Reverse the list to print in reverse order.
        Collections.reverse(fibonacciNumbers);

        System.out.println("Fibonacci series in reverse order:");
        for (int i : fibonacciNumbers) {
            System.out.print(i + " ");
        }
    }

//time complexity=O(n)
    // public static void main(String[] args)
    // {
    //     int n=10;
    //     int[] arr=new int[n];
    //     arr[0] =0;
    //     arr[1]=1;
    //     for(int i=2;i<n;i++)
    //     {
    //         arr[i]=arr[i-1] + arr[i-2];
    //     }
    //     //Fibonacci series 
    //     System.out.println("Fionacci series is:");
    //     for(int i=0;i<n;i++)
    //     System.out.print(arr[i] +" ");
    //     // Fibonacci series in reverse order
    //     System.out.println("Fionacci series in reverse is:");
    //     for(int i=n-1;i>=0;i--)
    //     System.out.print(arr[i] +" ");
    // }
}
