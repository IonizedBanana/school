public class IntLLTester {
   public static void main(String[] args) {
      int[] iArray = new int[10];
      IntLL iLL = new IntLL();
      for (int i = 0; i < 5; i++) {
         iLL.add(i);
      }
      iLL.print();

      System.out.println(iLL.get(1));
   }
}
