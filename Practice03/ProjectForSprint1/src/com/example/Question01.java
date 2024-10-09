package com.example;

import java.util.Scanner;

/* Description: Write a program to check whether a number is even or odd.  
   Example:  
   Input: number = 4 
   Output: Even  
   Explanation: Since 4 is divisible by 2, it is an even number.  */
public class Question01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number to check weather it is Even or Odd");
		int number = scanner.nextInt();
		System.out.println((number % 2 == 0 ? "Even" :"Odd"));
	}

}
