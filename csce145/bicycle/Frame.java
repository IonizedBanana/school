/*
 * code by Cayden Barnett
 */

public class Frame {
   // initializing vars
   private String type;
   private double size;

   // default and parameterized constructor
   public Frame() {
      setType("Diamond");
      setSize(18.5);
   }

   public Frame(double size, String type) {
      setType(type);
      setSize(size);
   }

   // getters and setters
   public String getType() {
      return type;
   }

   public void setType(String type) {
      if (type.equals("Diamond") || type.equals("Step-Through") || type.equals("Truss")
            || type.equals("Penny-Farthing")) {
         this.type = type;
      } else {
         this.type = "Diamond";
      }
   }

   public double getSize() {
      return size;
   }

   public void setSize(double size) {
      if (size >= 18.5 && size <= 60) {
         this.size = size;
      } else {
         this.size = 18.5;
      }
   }

   // toString function
   public String toString() {
      return ("Type: " + getType() + " Size: " + getSize());
   }

   // equals function
   public Boolean equals(Frame a) {
      if (this.type.equals(a.getType()) && this.size == a.getSize()) {
         return true;
      } else {
         return false;
      }
   }
}
