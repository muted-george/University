import java.util.Scanner;

public class blackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask user for their initial card value
        System.out.print("Please enter a number between 1 and 21: ");
        int card1 = scanner.nextInt();

        // Generate random values for the second card and dealer's card
        int card2 = (int) (Math.random() * 20 + 1);
        int dealerCard = (int) (Math.random() * 20 + 1);

        // Calculate totals
        int userTotal = card1 + card2;

        // Display the results
        System.out.println("User number: " + userTotal);
        System.out.println("Dealer number: " + dealerCard);

        // Determine the outcome
        if (userTotal > 21) {
            System.out.println("User busts! Dealer wins!");
        } else if (dealerCard > 21) {
            System.out.println("Dealer busts! User wins!");
        } else if (userTotal > dealerCard) {
            System.out.println("User wins!");
        } else if (userTotal < dealerCard) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }

        // Close scanner
        scanner.close();
    }
}
