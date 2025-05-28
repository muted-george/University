public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(10); // Creating a node with data 10
        Node node2 = new Node(20); // Creating another node with data 20

        node1.next = node2; // Linking node1 to node2

        // Printing values
        System.out.println(node1.data); // Output: 10
        System.out.println(node1.next.data); // Output: 20
    }
}
