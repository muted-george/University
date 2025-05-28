import java.util.*;
public class CustomSequence {
    public static void main(String[] args) {
        Scanner given = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the Custom Sequence Console:");
        System.out.println();
        System.out.println("Enter the number of terms:");
        int n = given.nextInt();
        System.out.println("The first " + n + " terms of the sequence are as follows: " + cusSequence(n-1) + "," + cusSequence(n) );


    }

    public static int cusSequence(int n) {
        if (n == 1) {
            return 2;
        } else if (n == 2) {
            return 3;
        } else if {
            return (cusSequence(n - 1) * cusSequence(n)) + 1;

        }
    }
}
