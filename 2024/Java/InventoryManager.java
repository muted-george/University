class IM {
    private String[] productNames;
    private int[] quantities;
    private int size;

    public IM() {
        // Initial capacity of the arrays
        productNames = new String[10];
        quantities = new int[10];
        size = 0;
    }

    // Method to add a product with a specified quantity
    public void addProduct(String productName, int quantity) {
        // Check if the product already exists
        for (int i = 0; i < size; i++) {
            if (productNames[i].equals(productName)) {
                quantities[i] = quantity;
                return;
            }
        }
        // If product doesn't exist, add new product
        if (size == productNames.length) {
            // Resize arrays
            resizeArrays();
        }
        productNames[size] = productName;
        quantities[size] = quantity;
        size++;
    }

    // Method to check the quantity of a specific product
    public int checkQuantity(String productName) {
        for (int i = 0; i < size; i++) {
            if (productNames[i].equals(productName)) {
                return quantities[i];
            }
        }
        return 0; // Product not found
    }

    // Method to display all products and their quantities
    public void displayAllProducts() {
        for (int i = 0; i < size; i++) {
            System.out.println(productNames[i] + ": " + quantities[i]);
        }
    }

    // Method to resize arrays
    private void resizeArrays() {
        int newSize = productNames.length * 2;
        String[] newProductNames = new String[newSize];
        int[] newQuantities = new int[newSize];
        System.arraycopy(productNames, 0, newProductNames, 0, productNames.length);
        System.arraycopy(quantities, 0, newQuantities, 0, quantities.length);
        productNames = newProductNames;
        quantities = newQuantities;
    }
}

public class InventoryManager {
    public static void main(String[] args) {

    }
}
