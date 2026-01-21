import java.util.Scanner;

public class MatrixTest {

   public static void printMatrix(int[][] i) {
      for (int a = 0; a < i.length; a++) {
         for (int b = 0; b < i[a].length; b++) {
            System.out.print(i[a][b]);
            System.out.print(" ");
         }
         System.out.print("\n");
      }
   }

   public static void main(String args[]) {
      Scanner k = new Scanner(System.in);
      int[][] matrixOne = new int[2][2];
      for (int i = 0; i < matrixOne.length; i++) {
         for (int j = 0; j < matrixOne[i].length; j++) {
            System.out.println("input the value at index " + i + " " + j + " for matrix one");
            matrixOne[i][j] = k.nextInt();
         }
      }
      int tempArray[] = matrixOne[0];
      matrixOne[0] = matrixOne[1];
      matrixOne[1] = tempArray;
      printMatrix(matrixOne);
      
   }
}
