
public class Question1 {
    public static void main(String[] args) {

        //each of the rolls
        int die1 = (int)(Math.random()*6) + 1;
        System.out.println("The first die comes up " +die1);

        int die2 = (int)(Math.random()*6) + 1;
        System.out.println("The first die comes up " +die2);

        int die3 = (int)(Math.random()*6) + 1;
        System.out.println("The second comes up " +die3);

        //the total
        int totalRoll = die1 + die2 + die3;
        System.out.println("The total roll is " +totalRoll);
    }
}