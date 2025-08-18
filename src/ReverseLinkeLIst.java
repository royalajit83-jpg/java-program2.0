public class ReverseLinkeLIst {
  public class Node{
      int data;
      Node next;

      public Node(){}
  }

  Node head = null;

  public void reverseList(){
      Node temp = head;
      Node prev = null;
      Node nexts;

      while (temp.next!=null){
          nexts = temp.next;
          temp.next = prev;
          prev = temp;
          temp = nexts;
      }
     head = prev;


  }
}
