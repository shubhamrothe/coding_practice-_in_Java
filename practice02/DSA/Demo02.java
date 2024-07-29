//Write a code to print mid of LinkedList

package practice02.DSA;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Demo02 {
    static Node head;

    public static void printMiddle(Node head) {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        Node slowPointer = head;
        Node fastPointer = head;

        // Move the fast pointer by 2 steps and the slow pointer by 1 step
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        // The slow pointer now points to the middle node
        System.out.println("The middle node of the linked list is: " + slowPointer.data);
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original LinkedList:");
        printList(head);

        printMiddle(head);
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
