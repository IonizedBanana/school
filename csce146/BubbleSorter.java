/*
 * Written by Cayden Barnett
 */
//Packages

import java.util.Random;
import java.util.Scanner;

//Do not alter-----------------------------------------------
public class BubbleSorter {
   // -----------------------------------------------------------
   public static final int ARRAY_SIZE = 10;

   // Do not alter-----------------------------------------------
   public static void main(String[] args) {
      // -----------------------------------------------------------

      Scanner keyboard = new Scanner(System.in);
      System.out.println("enter " + ARRAY_SIZE + " numbers to put in an array, and I'll sort them :)");
      int[] array = new int[ARRAY_SIZE];

      for (int i = 0; i < ARRAY_SIZE; i++) {
         System.out.println("enter value " + (i + 1));
         array[i] = keyboard.nextInt();
      }

      // sorting
      Boolean swapped;
      do {
         swapped = false;
         for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
               int temp = array[i];
               array[i] = array[i + 1];
               array[i + 1] = temp;
               swapped = true;
            }
         }
      } while (swapped);
      for (int i : array) {
         System.out.println(i);
      }
   }// Do not alter

}// Do not alter
