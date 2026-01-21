/*
 * written by Cayden Barnett
 */
import java.util.Scanner;

public class HelloWorld{
   public static void main(String[] args){
      System.out.println("Hello World!\nWhat is your name?");
      Scanner k = new Scanner(System.in);
      String name = k.nextLine();
      System.out.println("Hello " + name + "!\nHow many pets do you have " + name + "?");
      int pets = k.nextInt();
      System.out.println("WOW " + pets + " PETS?!");

   }
}
