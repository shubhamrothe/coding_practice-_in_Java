package com.example;

import java.util.*;


/*Description: Write a program to generate the Fibonacci series up to a given number.  
Example:  
Input: limit = 10  
Output: [0, 1, 1, 2, 3, 5, 8]  
Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8]. */

public class Question05 {

    public static void generateFibonacciSeriesUpToGivenNumber(int number) {
    	
    	int first =0;
    	int second = 1;
    	
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(first);
    	while(second<=number) {
    		list.add(second);
    		
    		int next=first+second;
    		first=second;
    		second=next;
    	}
    	System.out.println(list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        generateFibonacciSeriesUpToGivenNumber(number);
       
    }
}
