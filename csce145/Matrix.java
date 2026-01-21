import java.util.Scanner;

public class Matrix {

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
      System.out.println("please print the length and width of the first matrix:");
      System.out.println("length:");
      int length1 = k.nextInt();
      System.out.println("width:");
      int width1 = k.nextInt();
      System.out.println("please print the length and width of the second matrix:");
      System.out.println("length:");
      int length2 = k.nextInt();
      System.out.println("width:");
      int width2 = k.nextInt();
      if ((length1 != length2) || (width1 != width2)){
         System.out.println("invalid dimensions! these cannot be added.");
         System.exit(0);
      }
      int[][] matrixOne = new int[length1][width1];
      int[][] matrixTwo = new int[length2][width2];
      for (int i = 0; i < matrixOne.length; i++) {
         for (int j = 0; j < matrixOne[i].length; j++) {
            System.out.println("input the value at index " + i + " " + j + " for matrix one");
            matrixOne[i][j] = k.nextInt();
         }
      }
      for (int i = 0; i < matrixTwo.length; i++) {
         for (int j = 0; j < matrixTwo[i].length; j++) {
            System.out.println("input the value at index " + i + " " + j + " for matrix two");
            matrixTwo[i][j] = k.nextInt();
         }
      }


      printMatrix(matrixOne);
      System.out.println("+");
      printMatrix(matrixTwo);
      System.out.println("=");
      
      int[][] matrixTotal = new int[length1][width1];
      for (int i = 0; i < matrixTotal.length; i++) {
         for (int j = 0; j < matrixTotal[i].length; j++) {
            matrixTotal[i][j] = matrixOne[i][j] + matrixTwo[i][j];
         }
      }
      printMatrix(matrixTotal);
      
   }
}
