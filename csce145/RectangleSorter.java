/*
 * code by Cayden Barnett 
 */

import java.util.Scanner;

public class RectangleSorter {
   // method to print a given matrix
   public static void printMatrix(float[][] i) {
      for (int a = 0; a < i.length; a++) {
         for (int b = 0; b < i[a].length; b++) {
            System.out.print(i[a][b]);
            System.out.print(" ");
         }
         System.out.print("\n");
      }
   }

   // method to pring an array
   public static void printArray(float[] i) {
      for (int a = 0; a < i.length; a++) {
         System.out.println(i[a]);
      }
   }

   // method to take user input and create a table of rectangles
   // using one row of a two dimensional array as a representation
   // of each rectangles length and width
   public static float[][] createRects() {
      Scanner k = new Scanner(System.in);
      System.out.println("how many rectanlges are we creating?");
      int numberOfRects = k.nextInt();
      float[][] rectangles = new float[numberOfRects][2];
      for (int i = 0; i < numberOfRects; i++) {
         for (int j = 0; j < rectangles[i].length; j++) {
            if (j == 0) {
               System.out.println("input the length for rectangle " + (i + 1));
               rectangles[i][j] = k.nextFloat();
            } else if (j == 1) {
               System.out.println("input the width for rectangle " + (i + 1));
               rectangles[i][j] = k.nextFloat();
            }
         }
      }
      return rectangles;
   }

   // calculate the area for each rectangle in the rectangle table
   // returns an array of the areas, seperate from the list of rectangles
   public static float[] area(float[][] rectangles) {
      float[] area = new float[rectangles.length];
      for (int i = 0; i < rectangles.length; i++) {
         area[i] = rectangles[i][0] * rectangles[i][1];
      }
      return area;
   }

   // sorts the rectangles by area, from smallest to largest
   public static float[] sortAsc(float[][] rectangles) {
      boolean swapped = false;
      float[] sorted = area(rectangles);
      do {
         swapped = false;
         float tempSwap = 0f;
         for (int i = 0; i < sorted.length - 1; i++) {
            if (sorted[i] > sorted[i + 1]) {
               tempSwap = sorted[i];
               sorted[i] = sorted[i + 1];
               sorted[i + 1] = tempSwap;
               swapped = true;
            }
         }
      } while (swapped);
      return sorted;
   }

   // sorts the rectangles by area, from largest to smallest
   public static float[] sortDesc(float[][] rectangles) {
      float[] sorted = area(rectangles);
      boolean swapped = false;
      do {
         swapped = false;
         float tempSwap = 0f;
         for (int i = 0; i < sorted.length - 1; i++) {
            if (sorted[i] < sorted[i + 1]) {
               tempSwap = sorted[i];
               sorted[i] = sorted[i + 1];
               sorted[i + 1] = tempSwap;
               swapped = true;
            }
         }
      } while (swapped);
      return sorted;
   }

   // calculates the average of all the rectangles areas
   public static float average(float[][] rectangles) {
      float total = 0f;
      float[] area = area(rectangles);
      for (int i = 0; i < area.length; i++) {
         total += area[i];
      }
      float average = total / area.length;
      return average;
   }

   // gets the smallest area by sorting the list in ascending order
   // then taking the first rectangles area
   public static float min(float[][] rectangles) {
      float[] sorted = sortAsc(rectangles);
      return sorted[0];
   }

   // gets the largest area by sorting the list in descending order
   // and taking the first rectangles area
   public static float max(float[][] rectangles) {
      float[] sorted = sortDesc(rectangles);
      return sorted[0];
   }

   public static String options() {
      return "Welcome to the rectangle sorter! first create your rectangles, then choose an action!\n1. create rectangles\n2. sort by area from smallest to largest\n3. sort by area from largest to smallest\n4. display the average area\n5. get the smallest area\n6. get the largest area\n7. quit\n0. print the current table of rectangles\nPlease type in the corresponding number:";
   }

   public static void main(String[] args) {
      boolean go = true;
      float[][] rectangles = new float[0][0];
      float[] output = new float[0];
      float output2 = 0f;
      Scanner k = new Scanner(System.in);
      do {
         System.out.println(options());
         int choice = k.nextInt();
         if (choice == 1) {
            rectangles = createRects();
         } else if (choice == 2) {
            output = sortAsc(rectangles);
            System.out.println("The areas from lowest to highest are:");
            printArray(output);
         } else if (choice == 3) {
            output = sortDesc(rectangles);
            System.out.println("The areas sorted from highest to lowest are:");
            printArray(output);
         } else if (choice == 4) {
            output2 = average(rectangles);
            System.out.println("The average area is:");
            System.out.println(output2);
         } else if (choice == 5) {
            output2 = min(rectangles);
            System.out.println("The minimum area is:");
            System.out.println(output2);
         } else if (choice == 6) {
            output2 = max(rectangles);
            System.out.println("The maximum area is:");
            System.out.println(output2);
         } else if (choice == 7) {
            go = false;
            System.out.println("Goodbye!");
         } else if(choice == 0){
            System.out.println("The current set of rectangles are:");
            printMatrix(rectangles);
            System.out.println("each row represents a seperate rectangle, the first column is the length, the second column is the width");
         } else {
            System.out.println("invalid input!");
         }
         // clearing the buffer and pausing so the user can read the output
         k.nextLine();
         System.out.println("press enter to continue");
         k.nextLine();
      } while (go);
   }
}
