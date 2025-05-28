public class Node {
    int data;
    Node left;
    Node right;

    // Default constructor "C:\\Users\\georg\\IdeaProjects\\Trees\\src\\natNums"
    public Node() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    // Loaded constructor
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // Accessors (getters)
    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    // Mutators (setters)
    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}