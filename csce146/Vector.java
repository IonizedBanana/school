/*
 * code by Cayden Barnett 
 */

import java.util.Scanner;
// why can java not do exponents by default thats so dumb
import java.lang.Math;

public class Vector {
   // init scanner so I can use it in my functions
   static Scanner k = new Scanner(System.in);

   public static void main(String[] args) {
      Boolean quit = false;
      // main loop
      while (!quit) {
         System.out.println(
               "Enter 1. to add 2 vectors\nEnter 2. to subtract 2 vectors\nEnter 3. to find the magnitude of a vector\nEnter 9. to quit");
         int action = k.nextInt();
         if (action == 1) {
            int fail = add();
            // if the function returns 1 because of invalid size:
            if (fail == 1) {
               System.out.println("invalid size!");
               continue;
            }
         } else if (action == 2) {
            int fail = sub();
            // if the function returns 1 because of invalid size:
            if (fail == 1) {
               System.out.println("invalid size!");
               continue;
            }
         } else if (action == 3) {
            int fail = mag();
            // if the function returns 1 because of invalid size:
            if (fail == 1) {
               System.out.println("invalid size!");
               continue;
            }
         } else if (action == 9) {
            System.out.println("goodbye!");
            quit = true;
         } else {
            // making it so random input just continues instead of crashing
            continue;
         }
      }
   }

   // function to add two vectors
   public static int add() {
      System.out.println("input the size of the vectors");
      int vecSize = k.nextInt();
      // if the size is invalid, return here
      if (!(vecSize >= 1)) {
         return 1;
      }
      double[] vec1 = new double[vecSize];
      double[] vec2 = new double[vecSize];
      System.out.println("input the values for vector 1");
      for (int i = 0; i < vecSize; i++) {
         vec1[i] = k.nextInt();
      }
      System.out.println("input the values for vector 2");
      for (int i = 0; i < vecSize; i++) {
         vec2[i] = k.nextInt();
      }

      for (double d : vec1) {
         System.out.println(d);
      }
      System.out.println("+");
      for (double d : vec2) {
         System.out.println(d);
      }
      System.out.println("=");
      for (int i = 0; i < vecSize; i++) {
         System.out.println((vec1[i] + vec2[i]));
      }
      // return a default value because it was successful
      return 0;
   }

   // function to subtract two vectors
   public static int sub() {
      System.out.println("input the size of the vectors");
      int vecSize = k.nextInt();
      // if size is invalid return here
      if (!(vecSize >= 1)) {
         return 1;
      }
      double[] vec1 = new double[vecSize];
      double[] vec2 = new double[vecSize];
      System.out.println("input the values for vector 1");
      for (int i = 0; i < vecSize; i++) {
         vec1[i] = k.nextInt();
      }
      System.out.println("input the values for vector 2");
      for (int i = 0; i < vecSize; i++) {
         vec2[i] = k.nextInt();
      }

      for (double d : vec1) {
         System.out.println(d);
      }
      System.out.println("-");
      for (double d : vec2) {
         System.out.println(d);
      }
      System.out.println("=");
      for (int i = 0; i < vecSize; i++) {
         System.out.println((vec1[i] - vec2[i]));
      }
      // return a default value because it was successful
      return 0;
   }

   // function to calculate the magnitude of a vector
   public static int mag() {
      System.out.println("input the size of the vector");
      int vecSize = k.nextInt();
      // if the size is invalid return here
      if (!(vecSize >= 1)) {
         return 1;
      }
      double[] vec = new double[vecSize];
      System.out.println("input the values for the vector");
      for (int i = 0; i < vecSize; i++) {
         vec[i] = k.nextInt();
      }
      // add up the square of each value in the vector
      double squareTotal = 0;
      for (double d : vec) {
         squareTotal += Math.pow(d, 2);
      }
      // square root the total of all the squares
      double magnitude = Math.sqrt(squareTotal);
      System.out.println(magnitude);
      // return a default value because it was successful
      return 0;
   }
}
