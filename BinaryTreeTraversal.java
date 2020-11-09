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

  static int sum = 0;

  static int postOrderTraversal(TreeNode root) {
    if (root == null)
      return 0;
    int left = postOrderTraversal(root.left);
    int right = postOrderTraversal(root.right);
    sum += Math.abs(left - right);
    return root.val + left + right;
  }


  static class NodeAndLevel {
    TreeNode node;
    int level;

    NodeAndLevel(TreeNode node, int level) {
      this.node = node;
      this.level = level;
    }
  }


  public static void main(String args[]) {
    // int tree[] = {1, 2, 3, 4, 5, 5, 6, 7};

    TreeNode root = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);



    root.left = node2;
    root.right = node3;

    node2.left = node4;
    node2.right = node5;

    postOrderTraversal(root);
    System.out.println(sum);
  }
}
