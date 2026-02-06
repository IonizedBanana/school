public class NodeConcept {
   public static void main (String[] args) {
      Node head = new Node(0,null);
      head.link = new Node(1,null);
      head.link.link = new Node(2,null);
      head.link.link = new Node (4,head.link.link);

      Node temp = head;
      while(temp != null) {
         System.out.println(temp.data);
         temp = temp.link;
      }
   }
}
