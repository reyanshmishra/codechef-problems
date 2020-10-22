public class TriePrefixTree {
  static Node root;

  TriePrefixTree() {
    root = new Node();
  }

  static class Node {
    Node next[];
    boolean isWord;

    Node() {
      next = new Node[26];
      isWord = false;
    }
  }

  public void insert(String word) {
    Node curr = root;
    for (int i = 0; i < word.length(); i++) {
      char c = word.chatAt(i);
      int val = c - 'a';
      Node node = curr.next[val];
      if (node == null) {
        node = new Node();
        curr.next[val] = node;
      }
      curr = node;
    }
    curr.isWord = true;
  }

  static search(String word){
    Node
  }

  public static void main(String args[]) {

  }

}
