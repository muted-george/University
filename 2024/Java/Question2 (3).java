import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many eggs do you have?: ");
        double N = scanner.nextDouble();

        double greatGross = N / 1728;
        double remainingAfterGreatGross = N % 1728;
        double dozen = remainingAfterGreatGross/12;
        double extra = remainingAfterGreatGross % 12;

        if (N > 0 && N < 1000000) {

            System.out.println("your number of eggs is " + (int) greatGross + " great gross, "
                    + (int)dozen + " dozen, and " + (int) extra + " extra since " + (int) N + " is equal to "
                    + ((int)greatGross +"*1728" + "+ "+ (int)dozen+"*12 "+ "+ "+(int)extra)+".");
        } else {
            System.out.println("Why do you have so many eggs!? Enter a number between 0 and 1,000,000 ");
        }

    }
}
