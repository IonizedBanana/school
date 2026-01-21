import java.util.Scanner;

public class GradingCalculator{

   public static void main(String[] args){
      Scanner k = new Scanner(System.in);

      int aRange = 89;
      int bRange = 79;
      int cRange = 69;
      int dRange = 59;

      System.out.println("give me your homework, lab, and final grades (in order)");

      int hw = k.nextInt();
      int lab = k.nextInt();
      int finalExam = k.nextInt();

      float finalGrade = (hw * 0.4f) + (lab * 0.4f) + (finalExam * 0.2f);
      System.out.println("your final grade is: " + finalGrade);
      
      if (finalGrade > aRange){
         System.out.println("final grade: A");
      }else if( finalGrade > bRange){
         System.out.println("final grade: B");
      }else if(finalGrade > cRange){
         System.out.println("final grade: C");
      }else if(finalGrade > dRange){
         System.out.println("final grade: D");
      }else {
         System.out.println("you failed");
      }
   }
}
