public class Lotto {

    public static void main(String[] args) {
        // You get three tries
        for (int i = 0; i < 3; i++) {
            runLotto();
        }
    }

    public static void runLotto() {
        int[] lotteryNumbers = new int[5];  // Array to store 5 lottery numbers

        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = (int) (Math.random() * 49 + 1);  // Generate a number between 1 and 50
        }

        // Display lotto numbers
        System.out.print("Your Lottery numbers are: ");
        for (int i = 0; i < lotteryNumbers.length; i++) {
            System.out.print(lotteryNumbers[i] + " ");
        }
        System.out.println();
    }
}
