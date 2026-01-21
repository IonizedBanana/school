import java.util.Scanner;

public class Gameboard {
   public static void main(String[] args) {
      // make a 10x10 grid with an asterisk outline
      Scanner k = new Scanner(System.in);
      int boardSize = 10;
      int playerX = 4;
      int playerY = 4;
      char[][] board = new char[boardSize][boardSize];
      for (int y = 0; y < board.length; y++) {
         for (int x = 0; x < board[y].length; x++) {
            if (y == 0 || y == board.length - 1) {
               board[y][x] = '*';
            } else if (x == 0 || x == board.length - 1) {
               board[y][x] = '*';
            } else {
               board[x][y] = ' ';
            }
         }
      }
      // board[playerY][playerX] = 'P';

      String userInput = "";

      while (!userInput.equals("quit")) {
         for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
               if (y == playerY && x == playerX) {
                  System.out.print('P');
               } else {
                  System.out.print(board[y][x]);
               }
            }
            System.out.print("\n");
         }
         System.out.println("WASD or quit");
         userInput = k.nextLine();

         if(userInput.equals("w")){
            playerY--;
         } else if (userInput.equals("s")){
            playerY++;
         } else if (userInput.equals("a")){
            playerX--;
         } else if (userInput.equals("d")){
            playerX++;
         }
      }
   }
}
