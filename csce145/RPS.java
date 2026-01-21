/*
 * Code by Cayden Barnett 
 */

import java.util.Scanner;
import java.util.Random;

public class RPS {
   public static int game() {
      // uh i needed to move this somewhere else so i could focus on the repeating and point tracking 
      Scanner k = new Scanner(System.in);
      Random random = new Random();
      // doing a higher range and using modulus 3 seems to
      // provide more variance between runs
      String pcString = "";
      int pcBig = random.nextInt(100);
      int pc = pcBig % 3;
      // converting the integer to a string to make it easier to follow
      if (pc == 0) {
         pcString = "rock";
      } else if (pc == 1) {
         pcString = "paper";
      } else if (pc == 2) {
         pcString = "scissors";
      }
      // getting the player move and calculating if they won or lost or tied 
      // then returning a number so main knows what the result is
      System.out.println("do you want to play rock, paper, or scissors? type in your answer below:");
      String player = k.nextLine();
      if ((player.equals("rock") && pcString.equals("scissors")) || (player.equals("paper") && pcString.equals("rock"))
            || (player.equals("scissors") && pcString.equals("paper"))) {
         System.out.println("computer chose: " + pcString);
         return 1;
      } else if (player.equals(pcString)) {
         System.out.println("computer chose: " + pcString);
         return 0;
      } else {
         System.out.println("computer chose: " + pcString);
         return -1;
      }
   }

   public static void main(String[] args) {
      // looping the game and stuff here
      Scanner k = new Scanner(System.in);
      // declaring vars
      boolean play = true;
      int rounds = 0;
      int playerPoints = 0;
      int pcPoints = 0;
      // main game loop
      while (play) {
         // actually running the game, for 3 rounds
         do {
            int result = game();
            if (result == -1){
               pcPoints += 1;
            } else if (result == 1){
               playerPoints += 1;
            }
            // printing the points for each player and counting the round
            System.out.println("you have " + playerPoints + " points, computer has " + pcPoints + " points.");
            rounds += 1;
         } while (rounds < 3);
         // checking who won at the end of the game
         if (playerPoints > pcPoints){
            System.out.println("you won!");
         } else if (playerPoints == pcPoints){
            System.out.println("tie!");
         } else {
            System.out.println("you lost :(");
         }
         // asking the player if they want to play again
         if (rounds == 3){
            System.out.println("do you want to play again?");
            String again = k.nextLine();
            // if they answer no, exit the loop 
            // if they answer anything else, reset the counters
            if (again.equals("no")){
               play = false;
            } else {
               rounds = 0;
               playerPoints = 0;
               pcPoints = 0;
            }
         }
      }

   }
}
