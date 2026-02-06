public class GenLLTester {
   public static void main(String[] args) {
      GenLL<Double> dLL = new GenLL<Double>();
      dLL.add(5.0);
      dLL.add(1.0);

      for (int i = 0; i < 20; i++) {
         dLL.add((double)i * 4);
      }
      dLL.print();

      System.out.println(dLL.get(dLL.find(8.0)));
   }
}
