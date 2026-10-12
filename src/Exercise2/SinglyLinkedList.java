package Exercise2;

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

    // Instance variable
    private Node head;

    // Constructor
    public SinglyLinkedList() {
        head = null;
    }

    // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
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
    // Delete the middle node
    public void deleteMiddle() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        // Step 1: Count total number of nodes
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        // Find the middle index position
        int midIndex = count / 2;

        // Step 2: Find the node before the middle node
        Node prev = null;
        current = head;
        for (int i = 0; i < midIndex; i++) {
            prev = current;
            current = current.next;
        }

        // Change the next reference to bypass and remove the middle node
        if (prev != null) {
            prev.next = current.next;
        }
    }

    // Get the head
    public Node getHead() {
        return head;
    }
}