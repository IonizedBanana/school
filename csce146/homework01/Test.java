import java.util.Scanner;
import java.io.*;

public class Test {
   public static int getFileLength(){
      try {
         Scanner fileReader = new Scanner(new File("./prizeList.txt"));
         int index = 0;
         while (fileReader.hasNextLine()) {
            fileReader.nextLine();
            index++;
         }
         fileReader.close();
         return index;
      } catch (Exception e) {
         e.printStackTrace();
      }
      return 0;
   }
   public static void main(String[] args) {

      System.out.println(getFileLength());
      try {
         Scanner fileReader = new Scanner(new File("./prizeList.txt"));
         while (fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine());
         }
         fileReader.close();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
