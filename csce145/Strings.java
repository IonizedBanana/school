import java.util.Scanner;

public class StringsExample {
   public static void main(String[] args) {
      String hello = "Hello, World!";
      System.out.println(hello);

      String str = "abcdefg";
      System.out.println(str.charAt(0));

      String str2 = str.substring(2, 5);
      System.out.println(str2);

      Scanner keyboard = new Scanner(System.in);
      int i = keyboard.nextInt();
      System.out.println(i);
   }
}
