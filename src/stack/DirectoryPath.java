package stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DirectoryPath {
  public static void main(String[] args) {
    LinkedList<String> stack = new LinkedList<String>();
//    String path = "/a/./b/../../c/";
    String path ="/home/";
    String[] array = path.split("/");
    System.out.println(Arrays.toString(array));
    StringBuilder stringBuilder = new StringBuilder("/");
    for (String dir :
        array) {
      if ("..".equals(dir)) {
        stack.pop();
      } else if (".".equals(dir)) {

      } else {
        stack.push(dir);
      }

    }

    for (String string :
        stack) {
      stringBuilder.append(string);
    }
    System.out.println(stringBuilder);
  }
}
