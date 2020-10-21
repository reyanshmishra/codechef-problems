import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CousinsInBinaryTree1 {

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

    TreeNode root = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    root.left = node2;
    root.right = node3;
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);

    node2.left = node4;
    node2.right = node5;

    TreeNode node6 = new TreeNode(6);
    TreeNode node7 = new TreeNode(7);

    node3.left = node6;
    node3.right = node7;

    System.out.println(levelOrderTraversal(root, 4, 6));

  }


}
