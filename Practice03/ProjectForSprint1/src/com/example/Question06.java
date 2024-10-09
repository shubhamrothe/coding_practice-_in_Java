package com.example;

import java.util.Scanner;

/*
 * Description: Write a program to check if a string or number is a palindrome.  
   Example:  
   Input: string = "radar"
   Output: Palindrome 
   Explanation: "radar" reads the same backward as forward.  */
public class Question06 {

	
	public static boolean checkIsPalindrome( String input) {
		
		char[] array = input.toCharArray();
		char[] arr=new char[array.length];
		for(int i=0;i<array.length;i++) {
			arr[i]=array[array.length-1-i];
		}
		
		String newString = new String(arr);
		return newString.equals(input);
		
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter a String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		boolean checkIsPalindrome = checkIsPalindrome(input);
		
		String output= checkIsPalindrome? "Given string is Palindrome" : "Given string is not Palindrome";
		System.out.println(output);
		
	}
}

