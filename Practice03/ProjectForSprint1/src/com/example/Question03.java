package com.example;

import java.util.Scanner;

/*
 * Description: Write a program to check if a given year is a leap year.  
   Example:  
   Input: year = 2020
   Output: Leap Year
   Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by 400, so it is a leap year.*/
public class Question03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Year");
		int year = scanner.nextInt();
//		if((year%4==0 && year%100 !=0) ||year%400==0)
//			System.out.println("Leap Year");
//		else
//			System.out.println("Not Leap Year");
		
		System.out.println((year%4==0 && year%100 !=0 ||year%400==0) ? "Leap Year" : "Not Leap Year");
	}
}
