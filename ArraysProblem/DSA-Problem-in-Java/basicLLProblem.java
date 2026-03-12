public class basicLLProblem {

  class Node {
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  Node head;

  // Add at end (helper)
  public void addLast(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = newNode;
  }

  // Find & Remove Nth Node from End
  public void deleteNthfromEnd(int n){
    int size = 0;
    Node temp = head;

    while(temp != null){
      temp = temp.next;
      size++;
    }

    if(n == size){
      head = head.next;
      return;
    }

    int i = 1;
    int iToFind = size - n;
    Node prev = head;

    while(i < iToFind){
      prev = prev.next;
      i++;
    }

    prev.next = prev.next.next;
  }

  public void print(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public Node findMid(Node head){
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null){
      slow=slow.next;//+1
      fast=fast.next.next;//+2

    }
    return slow;//slow is my middle node
  }

  public boolean checkPalindrome(){
    if(head==null || head.next==null){
      return true;
    }
    //step 1- find mid
    Node midNode=findMid(head);
    //step-2 reverse 2nd half

    Node prev=null;
    Node curr= midNode;
    Node next;
    while(curr!=null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    Node right =prev;
    Node left = head; 

    //step3- check left half & right half

    while(right!=null){
      if(left.data!=right.data){
        return false;

      }
      left=left.next;
      right=right.next;
    }
    return true;
  }

  public static void main(String[] args) {
    basicLLProblem ll = new basicLLProblem();

    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);

    ll.print();
    ll.deleteNthfromEnd(2);
    ll.print();

    System.out.println(ll.checkPalindrome());
  }
}
