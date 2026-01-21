import java.util.Scanner;

public class Blackjack {
   public static int total(Card[] hand, int index) {
      int total = 0;
      boolean hasAce = false;
      for (int i = 0; i < index; i++) {
         total += hand[i].getValue();
         if (hand[i].getValue() == 1) {
            hasAce = true;
         }
      }
      if (hasAce && total <= 11) {
         total += 10;
      }
      return total;
   }

   public static void printHand(Card[] hand, int index) {
      for (int i = 0; i < index; i++) {
         System.out.println(hand[i]);
      }

   }

   public static void main(String[] args) {
      Card c = new Card();
      Card[] playerHand = new Card[10];
      Card[] dealerHand = new Card[10];
      int playerIndex = 0;
      int dealerIndex = 0;
      Scanner k = new Scanner(System.in);

      String[] suits = { "Spades", "Hearts", "Clubs", "Diamonds" };
      String[] displayValues = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
            "Queen", "King", "Ace" };
      int[] values = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1 };

      Deck d = new Deck(suits, displayValues, values);
      d.shuffle(10000);

      playerHand[playerIndex++] = d.deal();
      playerHand[playerIndex++] = d.deal();
      dealerHand[dealerIndex++] = d.deal();
      dealerHand[dealerIndex++] = d.deal();
      System.out.println("player hand:");
      printHand(playerHand, playerIndex);
      System.out.print('\n');
      System.out.println("dealer hand:");
      printHand(dealerHand, dealerIndex);

      if (total(playerHand, playerIndex) == 21) {
         System.out.println("Blackjack!");
         System.exit(0);
      }

      System.out.println("hit or stay?");
      String userIn = k.nextLine();

      while (userIn.toLowerCase().equals("hit")) {
         playerHand[playerIndex++] = d.deal();

         System.out.println("player hand:");
         printHand(playerHand, playerIndex);
         System.out.print('\n');
         System.out.println("dealer hand:");
         printHand(dealerHand, dealerIndex);

         if (total(playerHand, playerIndex) > 21) {
            break;
         }
         System.out.println("hit or stay?");
         userIn = k.nextLine();
      }

      while (total(playerHand, playerIndex) <= 21 && total(dealerHand, dealerIndex) < 17) {
         dealerHand[dealerIndex++] = d.deal();
      }

      System.out.println("player hand:");
      printHand(playerHand, playerIndex);
      System.out.print('\n');
      System.out.println("dealer hand:");
      printHand(dealerHand, dealerIndex);

      int playerScore = total(playerHand, playerIndex);
      int dealerScore = total(dealerHand, dealerIndex);

      System.out.println("\nplayer score: " + playerScore);
      System.out.println("dealer score: " + dealerScore);

      if (playerScore > 21) {
         System.out.println("player bust!");
      } else if (dealerScore > 21) {
         System.out.println("dealer bust!");
      } else if (playerScore > dealerScore) {
         System.out.println("player wins!");
      } else {
         System.out.println("dealer wins!");
      }
   }
}
