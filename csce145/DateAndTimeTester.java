/*
 * code by Cayden Barnett 
 */

import java.util.Scanner;

public class DateAndTimeTester {
   // test if the month is valid
   public static Boolean monthTest(int month) {

      if (!(month >= 1) || !(month <= 12)) {
         return false;
      }
      return true;
   }

   // test if the day is valid, given the month
   public static Boolean dayTest(int month, int day) {

      if (month == 2) {
         if (!(day >= 1) || !(day <= 28)) {
            return false;
         }
      } else if (month == 4 || month == 6 || month == 9 || month == 11) {
         if (!(day >= 1) || !(day <= 30)) {
            return false;
         }
      } else {
         if (!(day >= 1) || !(day <= 31)) {
            return false;
         }
      }
      return true;
   }

   // test if the hour is valid
   public static Boolean hourTest(int hour) {
      if (hour < 0 || hour > 12) {
         return false;
      } else {
         return true;
      }
   }

   // test if the minute is valid
   public static Boolean minuteTest(int minute) {
      if (minute < 0 || minute > 59) {
         return false;
      } else {
         return true;
      }
   }

   // the actual code for running the checks, getting user input, etc
   public static void logic() {
      // initializing vars for my indexes
      int index = 0;
      int monthIndex = 0;
      int timeIndex = 0;
      Scanner k = new Scanner(System.in);
      System.out.println("enter a date and time MM/DD hh:mm and I will determine if it is valid");
      String date = k.nextLine();
      // setting index bounds for each component
      for (int i = 0; i < date.length(); i++) {
         if (date.charAt(i) == ' ') {
            index = i;
         }
      }
      for (int i = 0; i < date.length(); i++) {
         if (date.charAt(i) == '/') {
            monthIndex = i;
         }
      }
      for (int i = 0; i < date.length(); i++) {
         if (date.charAt(i) == ':') {
            timeIndex = i;
         }
      }
      // taking each calculated index and making an integer out of each part
      int month = Integer.parseInt(date.substring(0, monthIndex));
      int day = Integer.parseInt(date.substring(monthIndex + 1, index));
      int hour = Integer.parseInt(date.substring(index + 1, timeIndex));
      int minute = Integer.parseInt(date.substring(timeIndex + 1));

      // getting the results from each test to see if all the inputs are valid
      Boolean monthBool = monthTest(month);
      Boolean dayBool = dayTest(month, day);
      Boolean hourBool = hourTest(hour);
      Boolean minuteBool = minuteTest(minute);

      // checking if all the tests returned true
      if (monthBool && dayBool && hourBool && minuteBool) {
         System.out.println("this is a valid date and time!");
      } else {
         System.out.println("this is not a valid date and time!");
      }
   }

   // the function that is called by the driver
   // this is just running the logic function in a loop
   public static void run() {
      Boolean check = true;
      do {
         logic();
         Scanner k = new Scanner(System.in);
         System.out.println("do you want to check another date? type quit to exit or press [ENTER] to continue");
         String checkStr = k.nextLine();
         if (checkStr.equals("quit")){
            check = false;
            System.out.println("Goodbye");
         }
      } while (check);
   }
}
