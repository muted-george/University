public class Main {
    Node head; // Head of the linked list

    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Correctly placed print method inside Main
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // Indicate end of list
    }

    public static void main(String[] args) {
        Main myList = new Main();

        // Creating and linking nodes
        myList.head = new Node(16);
        Node second = new Node(19);
        Node third = new Node(22);

        myList.head.next = second;
        second.next = third;

        // Calling print() to display the linked list
        myList.print();
    }
}
