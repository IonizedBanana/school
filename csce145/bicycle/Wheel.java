/*
 * code by Cayden Barnett
 */

public class Wheel {
   // initializing vars
   private double diameter;
   private double width;

   // default and parameterized constructor
   public Wheel() {
      setDiameter(16);
      setWidth(1);
   }

   public Wheel(double diameter, double width){
      setDiameter(diameter);
      setWidth(width);
   }

   // getters and setters
   public double getDiameter() {
      return diameter;
   }

   public void setDiameter(double diameter) {
      if (diameter >= 16 && diameter <= 55) {
         this.diameter = diameter;
      } else {
         this.diameter = 16;
      }
   }

   public double getWidth() {
      return width;
   }

   public void setWidth(double width) {
      if (width >= 1 && width <= 2.5) {
         this.width = width;
      } else {
         this.width = 1;
      }
   }

   // toString function
   public String toString() {
      return ("width: " + getWidth() + " diameter: " + getDiameter());
   }

   // equals function
   public Boolean equals(Wheel a){
      if(this.width == a.getWidth() && this.diameter == a.getDiameter()){
         return true;
      } else {
         return false;
      }
   }
}
