import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreePractice {
  static class Node {
    Node left, right;
    int data;

    Node(int key) {
      this.data = key;
    }

    public String toString() {
      return data + "";
    }
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    for (int i = 2; i < 6; i++)
      insertInTree(root, i);
    Node[] foundNodes  = findWithLevelOrder(root, 2);
    //swap found and last
    swapTreeNodes(foundNodes[0],foundNodes[1]);
    levelOrder(root);
  }

  static void swapTreeNodes(Node node, Node node2) {
    Node temp = node;
    node = node2;
    node2 = temp;
  }

  static Node[] findWithLevelOrder(Node root, int key) {
    Node[] list = new Node[2];
    Queue<Node> q = new LinkedList<>();
    Node current = root;
    q.add(root);
    while (!q.isEmpty()) {
      current = q.remove();
      if (current.data == key)
        list[0] = current;
      if (current.left != null)
        q.add(current.left);
      if (current.right != null)
        q.add(current.right);
    }
    // this is last
    list[1] = current;
    list[0].data = list[1].data;
    return list;
  }

  static void levelOrder(Node root) {
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
      Node current = q.remove();
      if (current.left != null)
        q.add(current.left);
      if (current.right != null)
        q.add(current.right);
      System.out.println(current.data);
    }
  }

  static void insertInTree(Node root, int key) {
    Queue<Node> q = new LinkedList<>();

    q.add(root);
    while (!q.isEmpty()) {
      // will take element from q and check its left or right if it has place
      Node i = q.remove();
      if (i.left == null) {
        i.left = new Node(key);
        break;
      } else
        q.add(i.left);
      if (i.right == null) {
        i.right = new Node(key);
        break;
      } else
        q.add(i.right);
    }
  }

  static void inOrder(Node root) {
    if (root == null)
      return;
    System.out.println(root.data);
    inOrder(root.left);
    inOrder(root.right);
  }
}
