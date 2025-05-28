public class Question1 {


    public static int[][] matrix_transpose(int[][] A) {
        if (A==null || A.length == 0 || A[0].length == 0) {
            return null;
        }

        int rows = A.length;
        int column = A[0].length;
        int[][] matrix = new int[column][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                matrix[j][i] = A[i][j];
            }
        }

        return matrix;

    }

    public static void myMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) { // Loop through each row
            for (int j = 0; j < matrix[i].length; j++) { // Loop through each column in current row
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] test = {{2, 3, 5}, { 6, 7, 8}};

        System.out.println("Matrix:");
        myMatrix(test);

        int[][] transposed = matrix_transpose(test);

        System.out.println("Transposed matrix:");
        myMatrix(transposed);


    }


}
