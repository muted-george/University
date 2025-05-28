public class Question1 {
    public static void main(String[] args) {
        int round = 1;

        while (round < 51) {
            System.out.println("-------------");
            System.out.println("Roll: " + round);
            System.out.println("-------------");
            int die1 = (int)(Math.random() * 6) + 1;
            int die2 = (int)(Math.random() * 6) + 1;

            System.out.println("The first die rolled a " + die1);
            System.out.println("The second die rolled a " + die2);

            if (die1 == 6 && die2 == 6) {
                System.out.println("The number of times it took to get Boxcars is: " + round);
            } else if (die1 == 1 && die2 == 1) { // Changed `&` to `&&`
                System.out.println("The number of times it took to get Snake Eyes is: " + round);
            } else if (die1 == die2) {
                System.out.println("The number of times it took to get Doublets is: " + round);
            } else if (die1 == die2 + 1 || die2 == die1 + 1) {
                System.out.println("The number of times it took to get Small Straight is: " + round);
            } else if (die1 + die2 == 3) { // Changed syntax for this condition
                System.out.println("The number of times it took to get Ace Deuces is: " + round);
            }

            round++;
        }
    }
}
