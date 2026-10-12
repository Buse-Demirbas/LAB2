package Exercise1;

/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Name: Buse DEMİRBAŞ
 * Student ID: 240444050
 * Date: 12/10/2026
 */

public class SinglyLinkedList {

    // -------------------------------------------------------
    // Instance variable
    private Node head;

    // -------------------------------------------------------
    // Constructor
    public SinglyLinkedList() {
        head = null;
    }

    // -------------------------------------------------------
    // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // -------------------------------------------------------
    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // -------------------------------------------------------
    // Find the middle node
    public Node findMiddle() {
        if (head == null) {
            return null;
        }

        // Count total number of nodes
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        // Find the middle index
        int midIndex = count / 2;

        // Traverse again to reach the middle index
        current = head;
        for (int i = 0; i < midIndex; i++) {
            current = current.next;
        }

        return current;
    }

    // -------------------------------------------------------
    // Get the head
    public Node getHead() {
        return head;
    }
}