package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class AddTwoNumbersII {
  public static void main(String[] args) {
    ListNode l1 = new ListNode(9);
    ListNode l3 = new ListNode(9);
    ListNode l2 = new ListNode(9);
    l2.next = l3;
    printReverse(l1, l2);
  }

  private static void printReverse(ListNode l1, ListNode l2) {
    Stack<Integer> first = new Stack<>();
    Stack<Integer> sec = new Stack<>();

    while (l1 != null) {
      first.add(l1.val);
      l1 = l1.next;
    }

    while (l2 != null) {
      sec.add(l2.val);
      l2 = l2.next;
    }
    ListNode node1 = null;
    ListNode node2 = null;
    int rem = 0;
    while (!first.isEmpty() || !sec.isEmpty()) {
      int v1 = first.isEmpty() ? 0 : first.pop();
      int v2 = sec.isEmpty() ? 0 : sec.pop();
      int value = v1 + v2 + rem;
      if (node1 == null) {
        node1 = new ListNode(value % 10);
      } else {
        node2 = new ListNode(value % 10);
        node2.next = node1;
        node1 = node2;
      }
      rem = value / 10;
    }
    if (rem > 0) {
      node2 = new ListNode(rem);
      node2.next = node1;
      node1 = node2;
    }
    System.out.println("");
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}


