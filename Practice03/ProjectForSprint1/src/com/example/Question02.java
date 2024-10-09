package com.example;

import java.util.Scanner;

/*
 * Description: Write a program to determine if a number is prime.  
   Example:  
   Input: number = 7  
   Output: Prime`  
   Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.  */
public class Question02 {

	static boolean checkPrimeOrNot(int number) {
		if(number<=1)
		return false;
		
		for(int i=2;i<=number/2;i++) {
			if(number%i==0)
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();

		boolean primeOrNot = checkPrimeOrNot(number);

		if(primeOrNot)
			System.out.println("Prime");
		else
			System.out.println(" Not Prime");

	}
}
