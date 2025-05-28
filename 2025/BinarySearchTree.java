public class BinarySearchTree {
    private Node root;
    private int size;

    // Default constructor
    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    // Loaded constructor
    public BinarySearchTree(Node root) {
        this.root = root;
        this.size = 1;
    }

    // Getters and setters
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Search method
    public boolean search(int value) {
        return searchHelper(root, value);
    }

    private boolean searchHelper(Node current, int value) {
        // If null node, value isn't in the tree
        if (current == null) {
            return false;
        }

        // If value at the current node is found
        if (value == current.getData()) {
            return true;
        }

        //left or right subtree?
        if (value < current.getData()) {
            // Search in the left subtree
            return searchHelper(current.getLeft(), value);
        } else {
            // Search in the right subtree
            return searchHelper(current.getRight(), value);
        }
    }

    // Insert method
    public void insert(Node newNode) {
        root = insertHelper(root, newNode);
        size++;
    }

    private Node insertHelper(Node current, Node newNode) {
        if (current == null) {
            return newNode;
        }
        if (newNode.getData() < current.getData()) {
            current.setLeft(insertHelper(current.getLeft(), newNode));
        } else if (newNode.getData() > current.getData()) {
            current.setRight(insertHelper(current.getRight(), newNode));
        }
        return current;
    }

    // Delete method
    public void delete(int value) {
        root = deleteHelper(root, value);
    }

    private Node deleteHelper(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.getData()) {
            size--;
            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            }
            if (current.getRight() == null) {
                return current.getLeft();
            }
            if (current.getLeft() == null) {
                return current.getRight();
            }
            int predecessorValue = findMax(current.getLeft());
            current.setData(predecessorValue);
            current.setLeft(deleteHelper(current.getLeft(), predecessorValue));
            return current;
        }

        if (value < current.getData()) {
            current.setLeft(deleteHelper(current.getLeft(), value));
        } else {
            current.setRight(deleteHelper(current.getRight(), value));
        }
        return current;
    }

    private int findMax(Node node) {
        return node.getRight() == null ? node.getData() : findMax(node.getRight());
    }

    // k-th smallest method
    public int find_kth_smallest(int k) {
        if (k < 1 || k > size) {
            throw new IllegalArgumentException("Input not valid");
        }
        int[] count = {0};
        int[] result = {0};
        inOrderTraversal(root, k, count, result);
        return result[0];
    }

    private void inOrderTraversal(Node node, int k, int[] count, int[] result) {
        if (node == null || count[0] >= k) {
            return;
        }
        inOrderTraversal(node.getLeft(), k, count, result);
        count[0]++;
        if (count[0] == k) {
            result[0] = node.getData();
            return;
        }
        inOrderTraversal(node.getRight(), k, count, result);
    }
}