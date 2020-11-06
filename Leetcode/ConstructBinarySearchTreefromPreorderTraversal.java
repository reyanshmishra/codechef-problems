package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ConstructBinarySearchTreefromPreorderTraversal {
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

  static void makeBST(TreeNode root, int v) {
    if (root.val < v && root.right != null) {
      makeBST(root.right, v);
      return;
    }

    if (root.val > v && root.left != null) {
      makeBST(root.left, v);
      return;
    }
    TreeNode node = new TreeNode(v);
    if (root.val > v) {
      root.left = node;
    }
    if (root.val < v) {
      root.right = node;
    }
    return;
  }

  static void preOrder(TreeNode node) {
    if (node.left != null) {
      preOrder(node.left);
    }
    System.out.println(node.val);
    if (node.right != null)
      preOrder(node.right);
  }

  public static void main(String args[]) {
    int arr[] = {8, 5, 1, 7, 10, 12};
    TreeNode root = new TreeNode(arr[0]);
    for (int i = 1; i < arr.length; i++) {
      makeBST(root, arr[i]);
    }
    // Level Order traversal
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }

    // Pre order
    preOrder(root);

  }
}
