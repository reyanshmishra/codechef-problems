import java.util.HashMap;

class Trie {
  static TrieNode root;

  Trie() {
    root = new TrieNode();
  }

  static class TrieNode {
    HashMap<Character, TrieNode> children;
    boolean endOfTheWord;

    TrieNode() {
      children = new HashMap<>();
      endOfTheWord = false;
    }
  }

  static void insert(String word) {
    TrieNode curr = root;
    for (char c : word.toCharArray()) {
      TrieNode node = curr.children.get(c);
      if (node == null) {
        node = new TrieNode();
        curr.children.put(c, node);
        curr = node;
      }
    }
    curr.endOfTheWord = true;
  }

  static boolean searchRecursively(String word, TrieNode node, int index) {
    if (index == word.length())
      return node.endOfTheWord;

    TrieNode curr = node.children.get(word.charAt(index));
    if (curr == null)
      return false;
    return searchRecursively(word, curr, index + 1);
  }

  static boolean search(String word) {
    TrieNode curr = root;
    for (char c : word.toCharArray()) {
      curr = curr.children.get(c);
      if (curr == null)
        return false;
    }
    return curr.endOfTheWord;
  }

  static boolean startsWith(String word) {
    TrieNode curr = root;
    for (char c : word.toCharArray()) {
      TrieNode node = curr.children.get(c);
      if (node == null)
        return false;
      curr = node;
    }
    return true;
  }

  static boolean startsWithRecursively(String word, TrieNode node, int i) {
    if (i == word.length())
      return true;
    TrieNode curr = node.children.get(word.charAt(i));
    if (curr == null)
      return false;
    return startsWithRecursively(word, curr, i + 1);
  }

  static boolean delete(String word, TrieNode node, int i) {
    if (i == word.length()) {
      if (!node.endOfTheWord) {
        return false;
      }
      return node.children.size() == 0;
    }
    char c = word.charAt(i);
    TrieNode curr = node.children.get(c);
    if (curr == null)
      return false;


    boolean shouldDelete = delete(word, curr, i + 1);
    if (shouldDelete) {
      node.children.remove(c);
      return node.children.size() == 0;
    }
    return false;
  }

  static boolean delete(String word) {
    return delete(word, root, 0);
  }

  public static void main(String args[]) {
    Trie trie = new Trie();

  }

}
