import java.util.Scanner;
public class p1q2t14428917 {
    public static void main(String[] args) {
        System.out.println("Hello out there.");
        System.out.println("I will add two numbers for you.");
        System.out.println("Enter two whole numbers on a line:");
        int n1;
        Scanner keyboard = new Scanner(System.in);
        n1 = keyboard.nextInt();
        int n2 = keyboard.nextInt();
        System.out.println("The sum of those two numbers is");
        System.out.println(n1 + n2);
    }
}