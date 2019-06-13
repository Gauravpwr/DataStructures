package linkedlist;

public class KreverseLinkedList {
  public static void main(String[] args) {
    Integer[] a = {1,2,3,4,5,6};
    Node start = Utility.getLinkedList(a);
    int k = 2;

    Node prev = null;
    Node current = start;
    Node next = null;
    while(current !=null){
      Node first = current;
      System.out.println(first.data);
      for(int i=0;i<k;i++) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
//        System.out.print(prev.data);
//        System.out.print(current.data);
//        System.out.println(next.data);
      }
      first.next = current;
    }

    Utility.printLinkedList(start);
  }
}
