public class Conditionals{

   public static void main(String[] args) {
      int i = 5;
      int j = 10;

      if(i == j){
         System.out.println("i is equal to j");
      } else {
         System.out.println("i is not equal to j");
      }
      
      boolean less = i < j;

      if(less){
         System.out.println("i is less than j");
      } else {
         System.out.println("i is not less than j");
      }

      boolean compound = i <= 5 && j != 6;

      if(compound){
         System.out.println("Glep!");
      } else {
         System.out.println("Glorp >:(");
      }
   }
}

