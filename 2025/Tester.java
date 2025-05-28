import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number of patients
        System.out.print("Enter the number of patients: ");
        int n = scanner.nextInt();

        // Step 2: Store arrival and departure times in an array
        int[][] patients = new int[n][2];

        System.out.println("Enter arrival and departure times (format: arrival,departure): ");
        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            String[] times = input.split(",");
            patients[i][0] = Integer.parseInt(times[0]); // Arrival time
            patients[i][1] = Integer.parseInt(times[1]); // Departure time
        }

        // Step 3: Find overlapping patients using O(n²) approach
        Set<String> pairs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (patients[j][0] < patients[i][1] && patients[j][0] >= patients[i][0]) {
                    pairs.add("(" + (i + 1) + "," + (j + 1) + ")");
                }
            }
        }

        // Step 4: Print the distinct pairs
        System.out.println("Distinct pairs of patients in the hospital at the same time:");
        System.out.println(pairs);

        scanner.close();
    }
}
