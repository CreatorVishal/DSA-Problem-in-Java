import java.util.*;

public class StackUsing2Queue {

  static class Stack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    boolean isEmpty() {
      return q1.isEmpty();
    }

    void push(int data) {
      q1.add(data);
    }

    int pop() {
      if (isEmpty())
        return -1;

      while (q1.size() > 1) {
        q2.add(q1.remove());
      }

      int top = q1.remove();

      // swap
      Queue<Integer> temp = q1;
      q1 = q2;
      q2 = temp;

      return top;
    }

    int peek() {
      if (isEmpty())
        return -1;

      while (q1.size() > 1) {
        q2.add(q1.remove());
      }

      int top = q1.peek();
      q2.add(q1.remove());

      // swap
      Queue<Integer> temp = q1;
      q1 = q2;
      q2 = temp;

      return top;
    }
  }

  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    while (!s.isEmpty()) {
      System.out.println(s.pop());
    }
  }
}
