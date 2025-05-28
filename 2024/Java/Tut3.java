public class Tut3 {
    public static void main(String[] args) {

        // For loop
        System.out.println("For loop:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While loop
        System.out.println("While loop:");
        int j = 2;
        while (j <= 20) {
            System.out.print(j + " ");
            j += 2;
        }
        System.out.println();

        // Do-while loop
        System.out.println("Do-while loop:");
        int k = 2;
        do {
            System.out.print(k + " ");
            k += 2;
        } while (k <= 20);
    }
}
