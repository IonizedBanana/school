import java.util.Scanner;

public class Sort {
   public static void main(String[] args) {
      boolean swapped = false;
      int[] values = { 4, 2, 1, 3, 5 };
      do {
         swapped = false;
         for (int i = 0; i < values.length - 1; i++) {
            System.out.println("is " + values[i] + " greater than " + values[i + 1] + " ?");
            if (values[i] > values[i + 1]) {
               System.out.println(values[i] > values[i + 1]);
               int swap = values[i];
               values[i] = values[i + 1];
               values[i + 1] = swap;
               swapped = true;
            } else {
               System.out.println(values[i] > values[i + 1]);
            }
            System.out.println("did it swap? " + swapped);
         }
      } while (swapped);
      for (int i = 0; i < values.length; i++) {
         System.out.println(values[i]);
      }
   }
}
