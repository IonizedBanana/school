/*
 * code by Cayden Barnett
 */

public class Car extends Vehicle {
   // instance vars
   private double gasMileage;
   private int numberOfPassengers;

   // constructors
   public Car() {
      super();
      setGasMileage(1);
      setNumberOfPassengers(1);
   }

   public Car(String manuName, int numberOfCylinders, String ownerName, double gasMileage, int numberOfPassengers) {
      super(manuName, numberOfCylinders, ownerName);
      setGasMileage(gasMileage);
      setNumberOfPassengers(numberOfPassengers);
   }

   // getters and setters
   public double getGasMileage() {
      return gasMileage;
   }

   public void setGasMileage(double gasMileage) {
      if (gasMileage >= 0) {
         this.gasMileage = gasMileage;
      } else {
         this.gasMileage = 1;
      }
   }

   public int getNumberOfPassengers() {
      return numberOfPassengers;
   }

   public void setNumberOfPassengers(int numberOfPassengers) {
      if (numberOfPassengers > 0) {
         this.numberOfPassengers = numberOfPassengers;
      } else {
         this.numberOfPassengers = 1;
      }
   }

   // toString method
   public String toString() {
      return (super.toString() + "\nGas Mileage: " + getGasMileage() + "\nNumber of Passengers: "
            + getNumberOfPassengers());
   }

   // equals method
   public Boolean equals(Car a) {
      return super.equals(a) && this.gasMileage == a.getGasMileage()
            && this.numberOfPassengers == a.getNumberOfPassengers();
   }

}
