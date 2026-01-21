import java.util.Scanner;

public class Arrays1{
   public static void main(String[] args) {
      System.out.println("how many numbers do you want to enter?");
      Scanner k = new Scanner(System.in);
      int amount = k.nextInt();

      int[] numbers = new int[amount];
      for(int i=0; i < numbers.length; i++){
         System.out.println("input a number ");
         numbers[i] = k.nextInt();
      }

      k.nextLine(); // cleaing buffer

      System.out.println("add or mulitply? ");
      String op = k.nextLine();
      if(op.equals("add")){
         int sum = 0;
         for(int i=0; i < numbers.length; i++){
            sum = sum + numbers[i];
         }
         System.out.println(sum);
      }else {
         int product = 1;
         for(int i=0; i < numbers.length; i++){
            product = product * numbers[i];
         }
         System.out.println(product);
      }
   }
}
