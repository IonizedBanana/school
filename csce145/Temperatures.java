/* 
 * written by Cayden Barnett 
 */

import java.util.Scanner;

public class Temperatures {
   // function for calculating the average of a floating point 
   // array. not really necessary but my code looked really messy 
   // when this was in main
   public static float average(float[] a){
      // initializing the var
      float total = 0f;
      // adds everything in the array
      for (int i = 0; i < a.length; i++){
         total += a[i];
      }
      // averages out the total 
      float avg = total/a.length;
      // returns the average
      return avg;
   }
   public static void main(String[] args) {
      // creating a scanner and initializing some vars
      Scanner k = new Scanner(System.in);
      float[] temps = new float[10];
      // getting the user input for all 10 days
      for (int days = 0; days < temps.length; days++){
         System.out.println("what was the temperature on day " + (days +1));
         temps[days] = k.nextFloat();
      }     
      // getting the average
      float result = average(temps);
      System.out.println("average temperature for these 10 days is " + result);
      System.out.println("days with a below average temperature are:");
      for (int low = 0; low < temps.length; low++){
         if(temps[low] < result){
            // maybe my longest println ever
            System.out.println("day " + (low +1) + " at " + temps[low] + " degrees");
         }
      }

   }
}
