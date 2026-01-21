/*
 * code by Cayden Barnett
 */

public class Vehicle {
   // instance vars
   private String manuName;
   private int numberOfCylinders;
   private String ownerName;

   // constructors
   public Vehicle() {
      setManuName("none");
      setNumberOfCylinders(6);
      setOwnerName("none");
   }

   public Vehicle(String manuName, int numberOfCylinders, String ownerName){
      setManuName(manuName);
      setNumberOfCylinders(numberOfCylinders);
      setOwnerName(ownerName);
   }

   // getters and setters
   public String getManuName() {
      return manuName;
   }

   public void setManuName(String manuName) {
      if (manuName != null) {
         this.manuName = manuName;
      } else {
         this.manuName = "none";
      }
   }

   public int getNumberOfCylinders() {
      return numberOfCylinders;
   }

   public void setNumberOfCylinders(int numberOfCylinders) {
      if (numberOfCylinders > 0) {
         this.numberOfCylinders = numberOfCylinders;
      } else {
         this.numberOfCylinders = 6;
      }
   }

   public String getOwnerName() {
      return ownerName;
   }

   public void setOwnerName(String ownerName) {
      if (ownerName != null) {
         this.ownerName = ownerName;
      } else {
         this.ownerName = "none";
      }
   }

   // toString method
   public String toString() {
      return ("Manufacturer's name: " + getManuName() + "\nNumber of Cylinders: " + getNumberOfCylinders() + "\nOwner's name: " + getOwnerName());
   }

   // equals method
   public Boolean equals(Vehicle a){
      return (getManuName().equals(a.getManuName()) && getNumberOfCylinders() == a.getNumberOfCylinders() && getOwnerName().equals(a.getOwnerName()));
   }
}
