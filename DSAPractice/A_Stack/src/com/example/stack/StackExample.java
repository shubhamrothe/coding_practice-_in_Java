package com.example.stack;

import java.util.Scanner;

public class StackExample {

	private int tos;
	private int maxSize;
	private int Stack[];

	// create stack
	public void createStack(int size) {
		tos = -1;
		maxSize=size;
		Stack = new int[size];
	}

	// To check is empty or not
	public boolean isEmpty() {
		if (tos == -1)
			return true;
		return false;
	}

	// To check is full or not
	public boolean isFull() {
		if (tos == maxSize - 1)
			return true;
		return false;
	}

	// To add element in stack
	public void push(int e) {
		tos++;
		Stack[tos] = e;
	}

	// To remove element from stack
	public int pop() {
		int temp = Stack[tos];
		tos--;
		return temp;
	}

	// To print stack
	public void printStack() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(Stack[i]);
		}
	}

	//
	public int peek() {
		return Stack[tos];
	}

	public static void main(String[] args) {
		int size, choice, e;
		StackExample obj = new StackExample();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of stack");
		size = scanner.nextInt();

		obj.createStack(size);
		do {
			System.out.println("\n Menu for Stack: \n 1. push \n 2. pop \n 3.peek \n 4. print \n 0.Exit \n");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				if (obj.isFull() != true) {
					System.out.println("Enter a element");
					e = scanner.nextInt();
					obj.push(e);
				} else {
					System.out.println("Stack is full !!");
				}
				break;
			case 2:
				if (obj.isEmpty() != true) {
					System.out.println("Element poped is: " + obj.pop());
				} else {
					System.out.println("Stack is empty !!");
				}
				break;
			case 3:
				if (obj.isEmpty() != true) {
					System.out.println("Element at peek : " + obj.peek());
				} else {
					System.out.println("Stack is empty !!");
				}
				break;
			case 4:
				if (obj.isEmpty() != true) {
					System.out.println("Elements of stack are:");
					obj.printStack();
				} else {
					System.out.println("Stack is empty !!");
				}
				break;
			case 0:
				System.out.println("Exiting the code !!");
				break;
			default:
				System.out.println("Wrong choice, please select again");
				break;

			}
		} while (choice != 0);

	}
}
