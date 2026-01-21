/*
 * code written by Cayden Barnett 
 */

import java.util.Scanner;

public class Zodiac {
   public static void main(String[] args) {
      Scanner k = new Scanner(System.in);
      System.out.println(
            "please type in your birthday as two integers separated by a space (1-12 for month, ex: 5 12 for may 12th)");
      // get the users input and store it as a string
      String birthday = k.nextLine();

      // my genious solution to handling all edge cases for a users inputs
      // by finding the space and setting the index to it
      // very adaptive and wont cease to function if they input something strange
      // unless its a character, but the requirements say I dont have to check that
      // :smirk:
      int index = 0;
      for (int i = 0; i < birthday.length(); i++) {
         if (birthday.charAt(i) == ' ') {
            index = i;
         }
      }
      int month = Integer.parseInt(birthday.substring(0, index));
      int day = Integer.parseInt(birthday.substring(index + 1));

      // checking if the month is between 1-12
      // yes I know I could have done month > 0 || month < 13
      // but this makes it more readable imo
      if (!(month >= 1) || !(month <= 12)) {
         System.out.println("not a valid month!");
         System.exit(0);
      }
      // checking if the day exceeds the days in that month
      // probably a better way to do this but it works so idc
      if (month == 2) {
         if (!(day >= 1) || !(day <= 29)) {
            System.out.println("invalid day!");
            System.exit(0);
         }
      } else if (month == 4 || month == 6 || month == 9 || month == 11) {
         if (!(day >= 1) || !(day <= 30)) {
            System.out.println("invalid day!");
            System.exit(0);
         }
      } else {
         if (!(day >= 1) || !(day <= 31)) {
            System.out.println("invalid day!");
            System.exit(0);
         }
      }

      // printing the inputted day, primarily for making it easier to test
      // but also so the user knows if they input it wrong
      System.out.println("the entered month is " + month);
      System.out.println("the entered day is " + day);

      // the wall of if statements to determine the zodiac sign
      if (((month == 1) && (day <= 19)) || ((month == 12) && (day >= 22))) {
         System.out.println("your zodiac is Capricorn");
      }
      if (((month == 2) && (day <= 18)) || ((month == 1) && (day >= 20))) {
         System.out.println("your zodiac is Aquarius");
      }
      if (((month == 3) && (day <= 20)) || ((month == 2) && (day >= 19))) {
         System.out.println("your zodiac is Pisces");
      }
      if (((month == 4) && (day <= 19)) || ((month == 3) && (day >= 21))) {
         System.out.println("your zodiac is Aries");
      }
      if (((month == 5) && (day <= 20)) || ((month == 4) && (day >= 20))) {
         System.out.println("your zodiac is Taurus");
      }
      if (((month == 6) && (day <= 20)) || ((month == 5) && (day >= 21))) {
         System.out.println("your zodiac is Gemini");
      }
      if (((month == 7) && (day <= 22)) || ((month == 6) && (day >= 21))) {
         System.out.println("your zodiac is Cancer");
      }
      if (((month == 8) && (day <= 22)) || ((month == 7) && (day >= 23))) {
         System.out.println("your zodiac is Leo");
      }
      if (((month == 9) && (day <= 22)) || ((month == 8) && (day >= 22))) {
         System.out.println("your zodiac is Virgo");
      }
      if (((month == 10) && (day <= 22)) || ((month == 9) && (day >= 23))) {
         System.out.println("your zodiac is Libra");
      }
      if (((month == 11) && (day <= 21)) || ((month == 10) && (day >= 23))) {
         System.out.println("your zodiac is Scorpio");
      }
      if (((month == 12) && (day <= 21)) || ((month == 11) && (day >= 22))) {
         System.out.println("your zodiac is Saggitarius");
      }
   }

}
