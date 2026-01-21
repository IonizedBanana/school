import java.util.Scanner;

public class Equals{
   public static void main(String[] args){
      System.out.println("example conditionals");

      Scanner k = new Scanner(System.in);
      String userInput = k.nextLine();
      System.out.println(userInput);

      // if(userInput == "Hello, world!"){
      if(userInput.equals("Hello, world!")){
         System.out.println("they are equal");
      } else {
         System.out.println("they are not equal");
      }
   }
}
