
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question2 {

    // Addition method
    public static int[][] matrix_addition(int[][] A, int[][] B) {
        int rows = A.length;
        int columns = A[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Convert string to matrix
    public static int[][] parseMatrix(String matrixStr) {
        String[] rowStrings = matrixStr.split(",");
        int rowCount = rowStrings.length;
        int colCount = rowStrings[0].trim().split("\\s+").length;

        int[][] matrix = new int[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            String[] elements = rowStrings[i].trim().split("\\s+");
            for (int j = 0; j < colCount; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
            }
        }

        return matrix;
    }
    //print out both matrices
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) { // Loop through each row
            for (int j = 0; j < matrix[i].length; j++) { // Loop through each column in current row
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        File file = new File("C:\\Users\\georg\\IdeaProjects\\matrix\\src\\mat_add");
        int matrixCount = 1;

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] matrices = line.split(";");

                if (matrices.length != 2) {
                    System.out.println("Invalid format at: " + line);
                    matrixCount++;
                    continue;
                }

                int[][] A = parseMatrix(matrices[0]);
                int[][] B = parseMatrix(matrices[1]);

                System.out.println("Matrix A:");
                printMatrix(A);
                System.out.println("Matrix B:");
                printMatrix(B);

                if (A.length != B.length || A[0].length != B[0].length) {
                    System.out.println("Cannot add matrices!");
                } else {
                    int[][] sum = matrix_addition(A, B);
                    System.out.println("Sum of matrices in row " + matrixCount + ":" );
                    printMatrix(sum);
                }

                System.out.println();
                matrixCount++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}