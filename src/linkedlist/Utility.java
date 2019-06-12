package linkedlist;

import java.util.ArrayList;

public class Utility {
    public static Node getLinkedList() {
        Integer[] a = {1,2,3,2,1};
        Node start = new Node(a[0]);
        Node current = start;
        for (int i = 1; i < a.length; i++) {
            Node node = new Node(a[i]);
            current.next = node;
            current = current.next;
        }
        return start;
    }

    public static void printLinkedList(Node start) {
        Node current = start;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static int getSizeOfLinkedList(Node start) {
        int size =0;
        Node current = start;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public static Node reverseLinkedList(Node start) {
        Node prev = null;
        Node current = start;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        start = prev;
        return start;
    }
}
