/*
 * code by Cayden Barnett
 */

public class Truck extends Vehicle {
   // instance vars
   private double loadCap;
   private double towCap;

   // constructors
   public Truck() {
      super();
      setLoadCap(1);
      setTowCap(1);
   }

   public Truck(String manuName, int numberOfCylinders, String ownerName, double loadCap, double towCap) {
      super(manuName, numberOfCylinders, ownerName);
      setLoadCap(loadCap);
      setTowCap(towCap);
   }

   // getters and setters
   public double getLoadCap() {
      return loadCap;
   }

   public void setLoadCap(double loadCap) {
      if (loadCap >= 0) {
         this.loadCap = loadCap;
      } else {
         this.loadCap = 1;
      }
   }

   public double getTowCap() {
      return towCap;
   }

   public void setTowCap(double towCap) {
      if (towCap >= 0) {
         this.towCap = towCap;
      } else {
         this.towCap = 1;
      }
   }

   // toString method
   public String toString(){
      return (super.toString() + "\nLoad Capacity: " + getLoadCap() + "\nTowing Capacity: " + getTowCap());
   }

   // equals method
   public boolean equals(Truck a) {
      return super.equals(a) && this.towCap == a.getTowCap() && this.loadCap == a.getLoadCap();
   }
}
