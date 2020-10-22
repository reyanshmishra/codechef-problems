import java.util.HashMap;

public class Trie {
  static TrieNode root;

  Trie() {
    root = new TrieNode();
  }

  static class TrieNode {
    HashMap<Character, TrieNode> children;
    boolean endOfWord;

    TrieNode() {
      children = new HashMap<>();
      endOfWord = false;
    }
  }

  public static void main(String args[]) {
    Trie trie = new Trie();
    trie.insert("apple");
    System.out.println(trie.search("apple"));
    System.out.println(trie.search("app"));
    System.out.println(trie.startsWith("app"));
    trie.insert("app");
    System.out.println(trie.search("app"));

  }

  static void insert(String word) {
    TrieNode current = root;
    for (char c : word.toCharArray()) {
      TrieNode node = current.children.get(c);
      if (node == null) {
        node = new TrieNode();
        current.children.put(c, node);
      }
      current = node;
    }
    current.endOfWord = true;
  }

  static boolean search(String word) {
    TrieNode current = root;
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      TrieNode node = current.children.get(c);
      if (node == null) {
        return false;
      }
      current = node;
    }
    return current.endOfWord;
  }

  static boolean startsWith(String word) {
    TrieNode current = root;
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      TrieNode node = current.children.get(c);
      if (node == null)
        return false;
      current = node;
    }
    return current != null;
  }
}
