import java.lang.Math;

public class Question3 {

    public static void main(String[] args) {

        double a = 0; // Lower bound
        double b = Math.PI; // Upper bound
        int n = 1000; // Number of intervals
        double h = (b - a) / n; // Width of each interval
        double sum = 0; // To store the sum of areas

        // Calculate the sum of areas using the trapezoidal rule
        for (int i = 1; i < n; i++) {
            double x_i = a + i * h;
            sum += Math.sin(x_i);
        }

        // Calculate the integral
        double integral = (h / 2) * (Math.sin(a) + Math.sin(b) + 2 * sum);

        // Output the result
        System.out.println("The approximate integral of sin(x) from 0 to π is: " + integral);
    }
}