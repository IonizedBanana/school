public class Cat {
   private String name;
   private double weight;
   private int numberOfLegs;

   public Cat() {
      this.setName("none");
      this.weight = 0.0;
      this.numberOfLegs = 0;
   }

   public Cat(String name, double weight, int numberOfLegs) {
      this.setName(name);
      this.weight = weight;
      this.numberOfLegs = numberOfLegs;
   }

   public void setName(String name) {
      if (name != null) {
         this.name = name;
      }
   }

   public void setWeight(double weight) {
      if (weight > 0.0) {
         this.weight = weight;
      }
   }

   public void setNumberOfLegs(int legs) {
      if ((legs >= 0) && (legs <= 4)) {
         this.numberOfLegs = legs;
      }
   }

   public String getName() {
      return this.name;
   }

   public double getWeight() {
      return this.weight;
   }

   public double getNumberOfLegs() {
      return this.numberOfLegs;
   }
}
