/* 
 * code by Cayden Barnett
 */
public class Apple {
   // creating variables
   private String type;
   private float weight;
   private float price;

   // default constructor
   public Apple() {
      this.type = "Gala";
      this.weight = 0f;
      this.price = 0f;
   }

   // parameterized constructor
   public Apple(String type, float weight, float price) {
      setType(type);
      setWeight(weight);
      setPrice(price);
   }
   
   // getters and setters
   // that check for valid input
   public String getType() {
      return type;
   }

   public void setType(String type) {
      if (type.equals("Granny Smith") || type.equals("Red Delicious")
            || type.equals("Golden Delicious") || type.equals("Gala")) {
         this.type = type;
      } else {
         this.type = "Gala";
      }
   }

   public float getWeight() {
      return weight;
   }

   public void setWeight(float weight) {
      if (weight > 0 && weight < 2) {
         this.weight = weight;
      } else {
         this.weight = 0f;
      }
   }

   public float getPrice() {
      return price;
   }

   public void setPrice(float price) {
      if (price >= 0) {
         this.price = price;
      } else {
         this.price = 0f;
      }
   }

   // checking if this object equals another
   public Boolean equals(Apple apple){
      if (this.type.equals(apple.getType()) && this.weight == apple.getWeight() && this.price == apple.getPrice()){
         return true;
      } else {
         return false;
      }
   }

   // toString method to print it out
   public String toString(){
      return ("Type: " + this.type + " weight: " + this.weight + " price: " + this.price);
   }
}
