package linkedlist;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    Integer[] a = {7, 17, 10, 13, 11};
    Node start = Utility.getLinkedList(a);
    Utility.printLinkedList(start);

    start = insertionSortList(start);

    Utility.printLinkedList(start);
  }

  public static Node putback(Node start1, int k){
    Node start=start1;
    if(start.data >k){
      start = new Node(k);
      start.next=start1;
      start1=start;
      return start1;
    }
    while(start.next != null){
      if(start.next.data > k){
        Node temp = start.next;
        start.next = new Node(k);
        start.next.next = temp;
        return start1;
      }
      start=start.next;
    }
    return start1;
  }
  public static Node insertionSortList(Node start1) {
    Node start=start1,current=start1;

    if(start1.next == null)
      return start1;

    while(current.next != null){
      if(current.next.data < current.data){
        start = putback(start,current.next.data);
        current.next = current.next.next;
      }else{
        current=current.next;
      }

    }
    return start;
  }
}
