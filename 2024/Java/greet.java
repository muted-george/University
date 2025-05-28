import java.util.Scanner;

public class greet {
    static void yourName(String greeting) {
        Scanner sc = new Scanner(System.in);
        System.out.println(greeting); // This uses the parameter passed to the method
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        sc.close(); // Closing the scanner after use
    }

    public static void main(String[] args) {
        yourName("Welcome! Let's get to know each other."); // Passing a custom greeting as a parameter
    }
}
