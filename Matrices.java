import java.util.Arrays;
import java.util.Random;

public class Matrices
{

  public static int[][] createMatrix(int row, int col)
  {
    Random random = new Random();
    int[][] matrix = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        matrix[i][j] = random.nextInt(10);
      }
    }
    return matrix;
  }


  public static void main(String[] args)
  {

    int[][] firstMatrix = createMatrix(2, 2); //
    int[][] secondMatrix = createMatrix(2, 2);
    int[][] resultSumOfMatrices = new int[firstMatrix.length][firstMatrix.length];
    int[][] resultDirectSumOfMatrices = new int[firstMatrix.length][firstMatrix.length];

    for (int i = 0; i < firstMatrix.length; i++) {   /// prints the two Matrices side by side
      for (int j = 0; j < firstMatrix[i].length; ++j) {
        System.out.print("  " + firstMatrix[i][j]);
      }
      System.out.print("  |");
      for (int k = 0; k < secondMatrix[i].length; ++k) {
        System.out.print("  " + secondMatrix[i][k]);
      }
      System.out.println();
    }

    System.out.println();

    for (int i = 0; i < firstMatrix.length; i++) {   /// adds and prints the value of the first and second matrices
      for (int j = 0; j < firstMatrix[i].length; ++j) {
        resultSumOfMatrices[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
        System.out.print("  " + resultSumOfMatrices[i][j] );
      }
      System.out.println();
    }

    System.out.println(); // empty line

    for (int i = 0; i < resultDirectSumOfMatrices.length; i++) { /// prints the first half of the direct sum
      for (int j = 0; j < firstMatrix[i].length; ++j) {
        System.out.print("  " + firstMatrix[i][j]);
      }
      for (int j = 0; j < resultDirectSumOfMatrices.length; j++) {
        System.out.print("  " + 0);
      }

      System.out.println();

    }

    for (int i = 0; i < resultDirectSumOfMatrices.length; i++) { /// prints the second half of the direct sum
      for (int j = 0; j < resultDirectSumOfMatrices.length; j++) {
        System.out.print("  " + 0);
      }
      for (int k = 0; k < secondMatrix[i].length; ++k) {
        System.out.print("  " + secondMatrix[i][k]);
      }

      System.out.println();
    }

  }
}
