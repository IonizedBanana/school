/* 
 * code by Cayden Barnett
 */
public class AppleTester {
   public static void main(String[] args) {
      // idk how to comment this. its a lot of print statements
      System.out.println("Welcome to the apple tester");
      System.out.println("");
      System.out.println("Creating a default apple");
      Apple a = new Apple();
      System.out.println(a);
      System.out.println("");
      System.out.println("creating another apple");
      System.out
            .println(
                  "setting the new apple's values to teh following, valid values: Type: Granny Smith Weight: 0.75 Price: 0.99");
      // vars for creating Apple b
      String bAppleType = "Granny Smith";
      float bAppleWeight = 0.75f;
      float bApplePrice = 0.99f;
      Apple b = new Apple(bAppleType, bAppleWeight, bApplePrice);
      System.out.println("printing the apples new values");
      System.out.println(b);
      System.out.println("");
      System.out.println("Creating another default apple");
      System.out.println(
            "Then setting the new apple's values to the following, invalid values: Type: iPad weight: 2.5 price: -200");
      // making third apple and using the setters
      Apple c = new Apple();
      c.setType("iPad");
      c.setWeight(2.5f);
      c.setPrice(-200);
      System.out.println(c);
      System.out.println("");
      System.out.println("checking if the first and last apples are the same");
      System.out.println(a.equals(c));

   }
}
