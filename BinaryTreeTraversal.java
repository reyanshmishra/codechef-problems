import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeTraversal {

  static class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }
  }

  static void preOrderTraversal(TreeNode root) {
    if (root == null)
      return;

    System.out.println(root.val);

    if (root.left != null) {
      preOrderTraversal(root.left);
    }

    if (root.right != null) {
      preOrderTraversal(root.right);
      return;
    }
  }


  static void inOrderTraversal(TreeNode root, List<Integer> list) {
    if (root == null)
      return;
    if (root.left != null)
      inOrderTraversal(root.left, list);
    list.add(root.val);
    if (root.right != null)
      inOrderTraversal(root.right, list);
  }


  static void postOrderTraversal(TreeNode root) {
    if (root == null)
      return;


    if (root.left != null) {
      preOrderTraversal(root.left);
    }

    if (root.right != null) {
      preOrderTraversal(root.right);
    }
    System.out.println(root.val);
  }


  static class NodeAndLevel {
    TreeNode node;
    int level;

    NodeAndLevel(TreeNode node, int level) {
      this.node = node;
      this.level = level;
    }
  }


  static boolean levelOrderTraversal(TreeNode root, int x, int y) {
    if (root == null)
      return false;
    Queue<TreeNode> queue = new LinkedList<>();
    HashMap<Integer, NodeAndLevel> map = new HashMap<>();
    queue.add(root);
    queue.add(null);
    int level = 1;
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node == null) {
        if (queue.peek() != null) {
          queue.add(null);
        }
        level++;
      } else {

        if (node.left != null)
          queue.add(node.left);

        if (node.right != null)
          queue.add(node.right);

        if (node.left != null && node.left.val > 0) {
          map.put(node.left.val, new NodeAndLevel(node, level));
        }

        if (node.right != null && node.right.val > 0) {
          map.put(node.right.val, new NodeAndLevel(node, level));
        }
      }
    }
    NodeAndLevel nodeX = map.get(x);
    NodeAndLevel nodeY = map.get(y);

    if (nodeX != null && nodeY != null && nodeX.node != null && nodeY.node != null
        && nodeX.node != nodeY.node && nodeX.level == nodeY.level) {
      return true;
    }
    return false;
  }


  public static void main(String args[]) {
    // int tree[] = {1, 2, 3, 4, 5, 5, 6, 7};

    TreeNode root = new TreeNode(3);
    TreeNode node2 = new TreeNode(1);
    TreeNode node3 = new TreeNode(4);

    root.left = node2;
    root.right = node3;

    TreeNode node5 = new TreeNode(2);
    node2.right = node5;

    // System.out.println(levelOrderTraversal(root, 4, 6));
    System.out.println("Pre order traversal.");
    preOrderTraversal(root);

    // System.out.println("In order traversal.");
    // List<Integer> list = new ArrayList<>();
    // inOrderTraversal(root, list);
    // System.out.println(list.get(3 - 1));

    // System.out.println("Post order traversal.");

    // postOrderTraversal(root);
  }


}
