public class Card {
   // step 1: Attributes
   // private attributes to prevent weird access
   private String suit;
   private String displayValue;
   private int value;

   // step 2: Constructors
   // these are like "printers" that makes the card exist in the code

   public Card() {
      setSuit("none");
      setDisplayValue("0");
      setValue(0);
   }

   public Card(String suit, String displayValue, int value) {
      setSuit(suit);
      setDisplayValue(displayValue);
      setValue(value);
   }

   public String toString() {
      return getDisplayValue() + " of " + getSuit();
   }

   // Step 3: getters and setters

   public String getSuit() {
      return suit;
   }

   public void setSuit(String suit) {
      this.suit = suit;
   }

   public String getDisplayValue() {
      return displayValue;
   }

   public void setDisplayValue(String displayValue) {
      this.displayValue = displayValue;
   }

   public int getValue() {
      return value;
   }

   public void setValue(int value) {
      this.value = value;
   }

}
