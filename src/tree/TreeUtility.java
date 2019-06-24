package tree;

import java.util.*;

public class TreeUtility {

  public static void main(String[] args) {
    Node root = getTree();
    levelOrder(root);
  }

  public static Node getTree() {
    int[] a = {6, 3, 7, 2, 5, 9};
    Node root = getNode(a, 0);
    return root;
  }

  private static Node getNode(int[] a, int i) {
    if (i >= a.length)
      return null;
    Node node = new Node(a[i]);
    node.left = getNode(a, i * 2 + 1);
    node.right = getNode(a, i * 2 + 2);
    return node;
  }

  private static void inOrder(Node node) {
    if (node == null)
      return;
    inOrder(node.left);
    System.out.println(node.data);
    inOrder(node.right);

  }

  private static void levelOrder(Node node) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(node);
    while (!queue.isEmpty()) {
      Node current = queue.remove();
      if (!Objects.isNull(current.left))
        queue.add(current.left);
      if (!Objects.isNull(current.right))
        queue.add(current.right);
      System.out.println(current.data);
    }
  }

}
