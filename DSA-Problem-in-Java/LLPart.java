
public class LLPart {

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head;

  boolean isCycle() {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;// +1
      fast = fast.next.next;// +2
      if (slow == fast) {
        return true;
      }

    }
    return false;

  }

  public void print() { // O(n)
    if (head == null) {
      System.out.println("LL is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "=>");
      temp = temp.next;
    }
    System.out.println("null");
  }

  void removeCycle() {
    // detect cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        cycle = true;
        break;
      }
    }
    if (cycle == false) {
      return;
    }
    // find meeting point
    slow = head;
    Node prev = null;
    while (slow != fast) {
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }

    // remove cycle -> last.next= null;
    prev.next = null;

  }
  public void zigZag(){
    Node slow=head;

    Node fast=head.next;
    //mid
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      
    }
    Node mid=slow;

    //reverse 2nd half
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;

    while (curr!=null) {
      next=curr.next;
      curr.next = prev;
      prev=curr;
      curr=next;
      
    }
    Node left=head;
    Node right=prev;
    Node nextL,nextR;
    while(left!=null && right != null){
      nextL=left.next;
      left.next=right;
      nextR=right.next;
      right.next=nextL;

    } 
  }



  public static void main(String[] args) {
    LLPart ll = new LLPart();
    ll.head = ll.new Node(1);
    ll.head.next = ll.new Node(2);
    ll.head.next.next = ll.new Node(3);
    // ll.head.next.next.next = ll.head.next;

    System.out.println(ll.isCycle());
    ll.removeCycle();
    System.out.println(ll.isCycle());
   ll.print();
    ll.zigZag();
   ll.print();


  }
}
