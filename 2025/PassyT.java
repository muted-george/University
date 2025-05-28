/*
import java.util.Scanner;
public class PassyT {
    public static void main(String[] args) {
        Scanner given = new Scanner(System.in);
        System.out.println("Enter new password:");
        String passy = given.nextLine();

        if (verifyPassword(passy)) {does thhe d
            System.out.println("Password verified");
        } else {
            System.out.println("Password not verified");
        }

        verifyPassword(passy);

        given.close();
    }

    public static boolean verifyPassword(String passy) {
        for (int i = 0; i < passy.length(); i++) {
            char ltr = passy.charAt(i);
            if (!Character.isLetterOrDigit(ltr)) {
                return false;

            } else if (!Character.isUpperCase(ltr)) {
                return false;

            } else if (!Character.isLowerCase(ltr)) {
                return false;

            } else if (Character.isDigit(ltr)) {
                return false;
            } else if (passy.length() < 8){
                return false;
            }
        }
}       return true;
}

*/
