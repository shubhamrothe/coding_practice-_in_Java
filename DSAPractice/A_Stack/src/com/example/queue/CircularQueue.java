package com.example.queue;

import java.util.Scanner;

public class CircularQueue {
    private int front, rear, size;
    static int capacity;
    private int[] queue;

    // Constructor to initialize the queue
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        front = size = 0;
        rear = capacity - 1;  // This is important, see the enqueue method
        queue = new int[capacity];
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to add an element to the queue (Enqueue)
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = data;
        size++;
        System.out.println(data + " enqueued to the queue.");
    }

    // Method to remove an element from the queue (Dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        System.out.println(data + " dequeued from the queue.");
        return data;
    }

    // Method to get the front element (Peek)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return queue[front];
    }

    // Method to display the elements in the queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of queue");
		 capacity = sc.nextInt();
        // Create a circular queue of size 5
    	CircularQueue obj = new CircularQueue(capacity);
    	int choice, e;
		do {
			System.out.println("\n Menu for Stack: \n 1. EnQueue \n 2. DeQueue \n 3. peek \n 4. print \n 0.Exit \n");
			 choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter element");
				e=sc.nextInt();
				obj.enqueue(e);
				break;
			case 2:
				System.out.println("Element dequeed is :"+ obj.dequeue());
				break;
			case 3:
				
				int peek = obj.peek();
				System.out.println("peek element :" +peek);
				break;
			case 4:
				obj.displayQueue();
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

