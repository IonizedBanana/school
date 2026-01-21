import java.util.Scanner;

public class BranchingNest {
   public static void main(String[] args){
      Scanner k = new Scanner(System.in);
      System.out.println("give me three numbers");
      int a = k.nextInt();
      int b = k.nextInt();
      int c = k.nextInt();
      if(a == b){
         System.out.println("a is equal to b");
      }else if (a == c){
         System.out.println("a is equal to c");
      }else{
         System.out.println("a is not equal to b or c");
      }
      // System.out.println(a + "\n" + b + "\n" + c);
      // if(a == b){
         // System.out.println("a is equal to b");
         // if(b == c){
            // System.out.println("b is equal to c");
         // }else {
            // System.out.println("b is not equal to c");
         // }
      // }else {
         // System.out.println("a is not equal to b");
      // }
   }
}
