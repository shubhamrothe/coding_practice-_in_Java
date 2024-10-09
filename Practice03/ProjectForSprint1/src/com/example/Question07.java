package com.example;

import java.util.Scanner;

/*
   Description: Write a program to create different star patterns (e.g., pyramid, diamond).  
   Example:  
   Input: patternType = "pyramid", height = 5  
   Output:  
   
       *
      ***
     *****
    *******
   *********
   
   Explanation: A pyramid pattern with a height of 5 is generated.
*/
public class Question07 {
	
	public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            //  for stars 
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            //for next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int rows = scanner.nextInt();

        printPattern(rows);
    }
}