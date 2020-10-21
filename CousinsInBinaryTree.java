
public class CousinsInBinaryTree {

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



  static class ParentLevel {
    TreeNode node;
    int level;

    ParentLevel(TreeNode node, int level) {
      this.node = node;
      this.level = level;
    }
  }


  static void findNode(TreeNode node, int value, int depth, TreeNode parent, ParentLevel nandL) {
    if (node == null)
      return;
    if (node.val == value) {
      nandL.level = depth;
      nandL.node = parent;
      return;
    }
    findNode(node.left, value, depth + 1, node, nandL);
    findNode(node.right, value, depth + 1, node, nandL);
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

    int x = 7, y = 6;
    ParentLevel parentAndLevelX = new ParentLevel(null, 0);
    ParentLevel parentAndLevelY = new ParentLevel(null, 0);

    findNode(root, x, 1, null, parentAndLevelX);
    findNode(root, y, 1, null, parentAndLevelY);
    if (parentAndLevelX.level == parentAndLevelY.level
        && parentAndLevelX.node != parentAndLevelY.node) {
      System.out.println(true);
    }
    System.out.println(false);
  }

}
