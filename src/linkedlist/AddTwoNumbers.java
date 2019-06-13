package linkedlist;

public class AddTwoNumbers {
  public static void main(String[] args) {
    Integer[] a1 = {9, 9};
    Node current1 = Utility.getLinkedList(a1);

    Integer[] a2 = {9, 9, 9};
    Node current2 = Utility.getLinkedList(a2);

    Node current3 = addTwoNumbers(current1,current2);
    current3 = Utility.reverseLinkedList(current3);
    Utility.printLinkedList(current3);
  }

  public static Node addTwoNumbers(Node current1, Node current2) {
    Node start = null;
    int sum = 0;
    int carry = 0;
    Node current3 = null;
    Node last = null;
    while (current1 != null || current2 != null) {
      sum=0;
      if (current1 != null) {
        sum = current1.data;
        current1 = current1.next;
      }
      if (current2 != null) {
        sum = sum + current2.data;
        current2 = current2.next;
      }
      sum = sum + carry;
      Node node = new Node(sum % 10);
      carry = sum / 10 % 10;
      if (start == null) {
        start = node;
        current3 = node;
      } else {
        current3.next = node;
        current3 = node;
      }
      // This is to remove 0 padding
      if (node.data != 0) {
        last = node;
      }
    }
    if (carry != 0) {
      Node node = new Node(carry);
      current3.next = node;
      node.next = null;
      last = node;
    }
    last.next = null;
    return start;
  }
}
