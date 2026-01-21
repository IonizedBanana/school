import java.io.IOException;

public class Game {
   public static Boolean game = true;
   // this seemed like a good starting place for the character
   static int playerX = 9;
   static int playerY = 39;

   public static void roomCheck() {
      Rooms r = new Rooms();
      // room 1
      if ((playerY <= 33 && playerY >= 31) && (playerX >= 16 && playerX <= 17)) {
         r.setRoom1(true);
         do {
            r.isInRoom();
            System.out.println("you read a sign, it says: \n" +
                  "Some ways I feel different after this semester are that I'm much more\n" +
                  "independent, since I dont have anyone else I can rely on to force me \n" +
                  "to do what I need to do.\n" +
                  "Another way I'm different is that I feel much more confident in my major choice.\n" +
                  "Before, I knew I thought it was interesting, but I wasnt sure how much I would \n" +
                  "actually enjoy it.\n" +
                  "Lastly, I think I'm more prepared for the rest of college. College classes are definitely\n" +
                  "a change of pace from highschool, and I definitely have more to work on, but I feel more comfortable.");
            try {
               int move = System.in.read();
               // 101 is the key code for 'e'
               if (move == 101) {
                  r.setRoom1(false);
                  // move player out of the room bounds when exiting
                  playerX -= 5;
               }
            } catch (IOException e) {
               System.out.println("IO Exception!" + e.getMessage());
            }
         } while (r.getRoom1());
         // room 2
      } else if ((playerY >= 25 && playerY <= 27) && (playerX >= 1 && playerX <= 2)) {
         r.setRoom2(true);
         do {
            r.isInRoom();
            System.out.println("you read a sign, it says:\n" +
                  "One thing I did this semester that really stuck with me is that I went to an Oso Oso concert\n" +
                  "with some friends. It was super fun, and it was really exciting to see a pretty small band that I actually\n"
                  +
                  "knew performing here, in columbia south carolina. The venue was pretty bad, and I'm not convinced that the room\n"
                  +
                  "would pass a fire inspection, and it was really hot so I had to run to a convenience store in the middle of the set\n"
                  +
                  "for some gatorade, but it was really fun. also check out Oso Oso on spotify if you've heard of and like midwest emo stuff :)");
            try {
               int move = System.in.read();
               if (move == 101) {
                  r.setRoom2(false);
                  // move player out of the room bounds when exiting
                  playerX += 5;
               }
            } catch (IOException e) {
               System.out.println("IO Exception! " + e.getMessage());
            }
         } while (r.getRoom2());
         // room 3
      } else if ((playerY >= 19 && playerY <= 21) && (playerX >= 16 && playerX <= 17)) {
         r.setRoom3(true);
         do {
            r.isInRoom();
            System.out.println("you read a sign, it says:\n" +
                  "some things I really look forward to are:\n" +
                  "1. not failing my classes (hopefully) this semester ((finals are scary))\n" +
                  "2. getting to do more than one of my major classes next semester\n" +
                  "3. possibly looking into internships this summer or next year\n" +
                  "4. getting a new job literally anytime soon (please)\n" +
                  "5. hopefully, starting my career by the time I graduate");
            try {
               int move = System.in.read();
               if (move == 101) {
                  r.setRoom3(false);
                  // move player out of the room bounds when exiting
                  playerX -= 5;
               }
            } catch (IOException e) {
               System.out.println("IO Exception! " + e.getMessage());
            }
         } while (r.getRoom3());
         // room 4
      } else if ((playerY >= 12 && playerY <= 14) && (playerX >= 1 && playerX <= 2)) {
         r.setRoom4(true);
         do {
            r.isInRoom();
            System.out.println("you read a sign, it says:\n" +
               "something negative because I just wanted to vent a little\n" +
               "is that I literally have classes until like 7 something pm next\n" +
               "semester on tuesday and thursday because the earlier classes either conflicted\n" +
               "or were reserved for some group of people, so not only am I in school from like 10am\n" +
               "to 7pm on tuesday and thursday, I barely even get a decent gap because I have 5 classes\n" +
               "on those days, just to fit all my stuff in.\n" +
               "my mondays and fridays are super easy though, I guess.");
            try {
               int move = System.in.read();
               if (move == 101) {
                  r.setRoom4(false);
                  // move player out of the room bounds when exiting
                  playerX += 5;
               }
            } catch (IOException e) {
               System.out.println("IO Exception! " + e.getMessage());
            }
         } while (r.getRoom4());
         // room 5 / final conclusion room
      } else if ((playerY <= 3 && playerY >= 1) && (playerX >= 6 && playerX <= 12)) {
         r.setRoom5(true);
         do {
            r.isInRoom();
            System.out.println("you read a final sign, it says:\n" +
               "Overall though, this was a pretty good first semester\n" +
               "It felt like a lot longer than a few months to me\n" + 
               "but the fact that I get all new classes for the next semester\n" +
               "makes it feel short at the same time. paradoxical.\n" +
               "I think I still have a lot to get used to and learn\n" +
               "but heres to hoping for a great second semester, and to more new friends! <3");
            try {
               int move = System.in.read();
               if (move == 101) {
                  // set game to false, and break the loop, which will close the app
                  game = false;
                  break;
               }
            } catch (IOException e) {
               System.out.println("IO Exception! " + e.getMessage());
            }
         } while (r.getRoom5());
      }

   }

   public static void main(String[] args) {
      Map.draw(playerX, playerY);
      do {
         try {
            int move = System.in.read();
            // System.out.println("input was " + move);
            switch (move) {
               // 119 is w
               case 119:
                  playerY--;
                  break;
               // 97 is a
               case 97:
                  playerX--;
                  break;
               // 115 is s
               case 115:
                  playerY++;
                  break;
               // 100 is d
               case 100:
                  playerX++;
                  break;
               // 10 is enter
               // i did this so it doesnt draw the map for each character inputted, only once
               // on enter
               case 10:
                  Map.draw(playerX, playerY);
                  break;
            }
         } catch (IOException e) {
            System.out.println("IO Exception! " + e.getMessage());
         }
         System.out.println("playerX = " + playerX + "\nplayerY = " + playerY);
         // runs the method to check if the player is in a room
         roomCheck();
      } while (game);
   }
}
