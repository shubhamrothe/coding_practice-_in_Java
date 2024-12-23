package com.example;

import java.util.Scanner;

/*  Pascal's Triangle
    Given an integer numRows, return the first numRows of Pascal's triangle.
	In Pascal's triangle, each number is the sum of the two numbers directly above it
*/
public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many no of rows you want? ");
		int numRows =sc.nextInt();
		
		for(int i=0;i<numRows;i++) {
			
			//for spaces
			
			for(int j=1;j<numRows-i;j++) {
				System.out.print(" ");
			}
			
			int number=1;
			for(int k=0;k<=i;k++) {
				System.out.print(number+" ");
				number = number * (i-k)/(k+1);
			}
			
			System.out.println();
			
		}
		
	}
	
}
