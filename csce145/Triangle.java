/*
 * code written by Cayden Barnett 
 */

import java.util.Scanner;

public class Triangle {
   public static void main(String[] args) {
      Scanner k = new Scanner(System.in);
      // get the user input
      System.out.println("how big do you want the triangle to be? input as a positive integer");
      // take the size in as a float, so it doesnt break
      // if the user inputs a non-whole number
      // then check if its a whole number or if its <= 0
      // exit if false/true
      float fSize = k.nextFloat();
      int size = (int) fSize;
      if (fSize % 1 != 0) {
         System.out.println("invalid input!");
         System.exit(0);
      } else if (!(size > 0)) {
         System.out.println("invalid input!");
         System.exit(0);
      }
      // create an ascending triangle
      for (int i = 0; i < size; i++) {
         for (int j = 0; j < i + 1; j++) {
            // print a star a specific number of times
            // I wish I could just do System.out.println("*" * i)
            System.out.print("*");
         }
         // print a new line character so the next loop
         // starts on a new line
         System.out.print('\n');
      }
      // same loop but backwards
      // to create a descending triangle
      for (int i = size; i > 0; i--) {
         for (int j = i - 1; j > 0; j--) {
            System.out.print("*");
         }
         System.out.print('\n');
      }

   }
}
