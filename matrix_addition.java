public class matrix_addition {

    public static void main(String[] args) {
      int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
      int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};
  
      // Assuming matrices have same dimensions (for simplicity)
      int rows = matrix1.length;
      int cols = matrix1[0].length;
  
      int[][] sumMatrix = new int[rows][cols];
  
      // Combine loops for readability
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
          sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
        }
      }
      
      System.out.println("Sum of matrices:");
      for (int[] row : sumMatrix) {
        for (int element : row) {
          System.out.print(element + " ");
        }
        System.out.println();
      }
    }
  }