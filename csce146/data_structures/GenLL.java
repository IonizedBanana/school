public class GenLL<T> {
   protected class ListNode {
      T data;
      ListNode link;

      public ListNode(T aData, ListNode aLink) {
         data = aData;
         link = aLink;
      }
   }

   protected ListNode head; // first element

   public GenLL() {
      head = null;
   }

   public void add(T aData) {
      // add to the end of the list
      ListNode newNode = new ListNode(aData, null);
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

   public void print() {
      ListNode temp = head;
      while (temp != null) {
         System.out.println(temp.data);
         temp = temp.link;
      }
   }

   public T get(int index) {
      ListNode temp = head;
      for (int i = 0; i < index; i++) {
         temp = temp.link;
      }
      if (temp == null) {
         return null;
      } else {
         return temp.data;
      }
   }

   public void set(int index, T aData) {
      ListNode temp = head;
      for (int i = 0; i < index; i++) {
         if (temp.link != null) {
            temp = temp.link;
         } else {
            return;
         }
      }
      temp.data = aData;
   }

   public int length() {
      int length = 0;
      ListNode temp = head;
      while (temp.link != null) {
         length += 1;
         temp = temp.link;
      }
      return length;
   }

   public int find(T aData) {
      int index = 0;
      ListNode temp = head;
      while (temp != null) {
         if (temp.data.equals(aData)) {
            break;
         } else {
            index += 1;
            temp = temp.link;
         }
      }
      return index;
   }
}
