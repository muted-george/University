import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.print("numbers from 1 to: ");
        Scanner take = new Scanner(System.in); //User input
        int n = take.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println("prime ");

            } else {
                System.out.println(i);
            }
        }

    }

    //Method to check if prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}