import java.util.*;

public class check {
    public static void main(String[] args) {
        Scanner given = new Scanner(System.in); // Create a scanner object to take user input
        System.out.println("Enter the number of patients: ");
        int num = given.nextInt(); // Take in user input for the number of patients
        //given.nextLine(); // Consume the leftover newline character
        // Create an ArrayList to store patient information (each patient has an arrival and departure time)
        ArrayList<int[]> patientInfo = new ArrayList<>();

        // Take in the arrival and departure times of each patient
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter the arrival and departure time of patient " + i + ":");
            given.useDelimiter(","); // Set comma as the delimiter for input
            int arrival = given.nextInt(); // Read arrival time
            int departure = given.nextInt(); // Read departure time
            //given.nextLine(); // Consume the leftover newline to prevent errors in the next iteration

            // Add the arrival and departure times as an array to the ArrayList
            patientInfo.add(new int[]{arrival, departure});
        }

        // Print out patient information
        System.out.println("Patient Information:");
        for (int i = 0; i < num; i++) {
            int[] times = patientInfo.get(i);
            System.out.println("Patient " + (i + 1) + " -> Arrival: " + times[0] + ", Departure: " + times[1]);
        }

        // Finding overlapping patients
        System.out.println("Pairs of patients at the hospital at the same time:");
        for (int i = 0; i < num; i++) { // O(n)
            for (int j = i + 1; j < num; j++) { // O(n)
                // Get the arrival and departure times of patient i and j
                int[] patientA = patientInfo.get(i);
                int[] patientB = patientInfo.get(j);

                // Check if times overlap (i.e., they are at the hospital at the same time)
                if (patientA[0] <= patientB[1] && patientB[0] <= patientA[1]) {
                    System.out.println("Patients " + (i + 1) + " and " + (j + 1) + " were at the hospital at the same time.");
                }
            }
        }
    }
}
