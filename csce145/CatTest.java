public class CatTest {
   public static void main(String[] args) {
      Cat cat = new Cat();
      Cat cat2 = new Cat("mittens", 9.3, 4);
      System.out.println(cat.getName());
      System.out.println(cat2.getWeight());
   }
}
