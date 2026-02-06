public class IntLL {
   protected class ListNode {
      int data;
      ListNode link;

      public ListNode(int aData, ListNode aLink) {
         data = aData;
         link = aLink;
      }
   }

   protected ListNode head; // first element
   protected ListNode current;
   protected ListNode previous;

   public IntLL() {
      head = current = null;
   }

   public void add(int aData) {
      // add to the end of the list
      ListNode newNode = new ListNode(aData,null);
      // empty list
      if (head == null) {
         head = newNode;
         return;
      } 
      // if we get here, the list has stuff in it
      ListNode temp = head;
      while (temp.link != null) {
         temp = temp.link;
      }
      temp.link = newNode;
   }

   public void print(){
      ListNode temp = head;
      while (temp != null){
         System.out.println(temp.data);
         temp = temp.link;
      }
   }

   public int get(int index) {
      ListNode temp = head;
      for (int i = 0; i < index; i++) {
         temp = temp.link;
      }
      return temp.data;
   }

   public int length() {
      int length = 0;
      ListNode temp = head;
      while(temp != null) {
         length += 1;
         temp = temp.link;
      }
      return length;
   }


   public int getCurrent() {
      return current.data;
   }

   public void goToNext() {
      previous = current;
      current = current.link;
   }

   public void setCurrent(int aData) {
      current.data = aData;
   }

   public void reset() {
      current = head;
      previous = null;
   }

   public Boolean hasMore() {
      return current.link != null;
   }
}
