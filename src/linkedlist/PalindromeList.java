package linkedlist;

public class PalindromeList {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5,6};
        Node start = Utility.getLinkedList(a);
        int size = Utility.getSizeOfLinkedList(start);
        Boolean isSizeOdd = (size % 2) == 0 ? false : true;
        //reverse the link list
        Node current = start;
        for (int i = 0; i < (size + 1) / 2; i++) {
            current = current.next;
        }
        Node secondHalf = current;
        secondHalf = Utility.reverseLinkedList(secondHalf);
        Utility.printLinkedList(secondHalf);

        Node current1 = start;
        Node current2 = secondHalf;
        Boolean isPalindrome = true;
        // if size is odd skip mid element
        if (isSizeOdd)
            size = size - 2;
        for (int i = 0; i < (size + 1) / 2; i++) {
            if (current1.data != current2.data) {
                System.out.println("not palindrome.");
                isPalindrome = false;
                break;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        if (isPalindrome) {
            System.out.println("palindrome.");
        }
    }
}
