/***
Mutevhani
Takudzwa
4428917
 CSC211 2025 Practical 2
contactTracing.java
 */

import java.util.*;

public class contactTracing {
    public static void main(String[] args) {
        Scanner given = new Scanner(System.in);
        System.out.print("Enter the number of patients: ");
        int num = given.nextInt();
        given.nextLine(); // Consume the newline character (?)

        // Create ArrayList to store patient arrival and departure times
        ArrayList<int[]> patientInfo = new ArrayList<>();

        // Take arrival and departure times of each patient
        for (int i = 1; i <= num; i++) { // O(n)
            System.out.print("Give the times of arrival and departure of patient " + i + " (e.g. 2,4): ");
            String input = given.nextLine();
            String[] times = input.split(",");

            // Convert input strings to integers
            int arrival = Integer.parseInt(times[0]); //Convert lhs to int
            int departure = Integer.parseInt(times[1]); //Convert rhs to int

            // Add the arrival and departure times to the ArrayList
            patientInfo.add(new int[]{arrival, departure});
        }

        // Finding overlaps
        System.out.println("The distinct pairs of patients who are at the hospital simultaneously are:");
        for (int i = 0; i < num; i++) { // O(n)
            for (int j = i + 1; j < num; j++) { // O(n)
                int[] patient1 = patientInfo.get(i);
                int[] patient2 = patientInfo.get(j);

                // Check if times overlap
                if (patient1[0] <= patient2[1] && patient2[0] <= patient1[1]) {
                    System.out.println("(" + (i + 1) + ", " + (j + 1) + ")");
                }
            }
        }

        given.close();
    }
}
