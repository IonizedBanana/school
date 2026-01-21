/*
 * code by Cayden Barnett
 */

public class Bicycle {
   // initializing vars
   private Wheel frontWheel;
   private Wheel backWheel;
   private Frame frame;
   private String make;

   // default and parameterized constructor
   public Bicycle() {
      this.frontWheel = new Wheel();
      this.backWheel = new Wheel();
      this.frame = new Frame();
      this.make = "none";
   }

   public Bicycle(String make, Wheel frontWheel, Wheel backWheel, Frame frame){
      setFrame(frame);
      setFrontWheel(frontWheel);
      setBackWheel(backWheel);
      setMake(make);
   }

   // getters and setters
   public void setMake(String make) {
      if (make != null) {
         this.make = make;
      } else {
         this.make = "none";
      }
   }

   public String getMake() {
      return this.make;
   }

   public Wheel getFrontWheel() {
      return frontWheel;
   }

   public void setFrontWheel(Wheel frontWheel) {
      this.frontWheel = frontWheel;
   }

   public Wheel getBackWheel() {
      return backWheel;
   }

   public void setBackWheel(Wheel backWheel) {
      this.backWheel = backWheel;
   }

   public Frame getFrame() {
      return frame;
   }

   public void setFrame(Frame frame) {
      this.frame = frame;
   }

   // equals function
   public Boolean equals(Bicycle a) {
      if (this.frontWheel.equals(a.getFrontWheel()) && this.backWheel.equals(a.getBackWheel())
            && this.frame.equals(a.getFrame()) && this.make.equals(a.getMake())) {
         return true;
      } else {
         return false;
      }
   }

   // toString function
   public String toString(){
      return ("Make: " + make + "\nfront wheel: " + frontWheel + "\nrear wheel: " + backWheel + "\nframe: " + frame);
   }
}
