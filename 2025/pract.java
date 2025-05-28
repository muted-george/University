public class pract {
    public static void countDown(int n) {
        if (n == 0) return; // Base Case
        System.out.println(n);
        countDown(n - 1); // Recursive Step
    }

    public static void main(String[] args) {
        countDown(5); // Output: 5, 4, 3, 2, 1
    }
}
