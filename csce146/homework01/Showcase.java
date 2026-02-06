import java.util.Scanner;
import java.io.*;

public class Showcase {
   public static class Prize {
      private String item;
      private int price;

      public Prize(int price, String item) {
         this.item = item;
         this.price = price;
      }

      public int getPrice() {
         return this.price;
      }

      public String getItem() {
         return this.item;
      }
   }

   public static int getFileLength() {
      try {
         Scanner fileReader = new Scanner(new File("./prizeList.txt"));
         int length = 0;
         while (fileReader.hasNextLine()) {
            fileReader.nextLine();
            length++;
         }
         fileReader.close();
         return length;
      } catch (Exception e) {
         e.printStackTrace();
      }
      return 0;
   }

   public static Prize[] createArr() {
      Prize[] prizes;
      try {
         Scanner fileReader = new Scanner(new File("./prizeList.txt"));
         int length = getFileLength();
         prizes = new Prize[length];
         int place = 0;
         while (fileReader.hasNextLine()) {
            String prize = fileReader.nextLine();
            Boolean valid = false;
            for (int i = 0; i < prize.length(); i++) {
               if (prize.charAt(i) == '\t') {
                  String name = prize.substring(0, i);
                  int price = Integer.parseInt(prize.substring(i + 1));
                  prizes[place] = new Prize(price, name);
                  System.out.println("place: " + place + " valid = true");
                  valid = true;
                  place++;
                  break;
               }
            }
            if (!valid) {
               prizes[place] = null;
               System.out.println("place: " + place + " valid = false");
               place++;
            }
         }
         fileReader.close();
         return prizes;
      } catch (Exception e) {
         e.printStackTrace();
      }
      return null;
   }

   public static void main(String[] args) {
      Prize[] prizes = createArr();
      System.out.println(prizes.length);
      for (int i = 0; i < prizes.length; i++) {
         if (prizes[i] != null) {
            System.out.println(prizes[i].item + " " + prizes[i].price);
         }
      }
   }
}
