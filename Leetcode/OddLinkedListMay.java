package Leetcode;

class OddLinkedListMay {
  static class LinkList {
    LinkList next;
    int val;

    LinkList(int val) {
      this.val = val;
    }

    LinkList(int val, LinkList next) {
      this.val = val;
      this.next = next;
    }
  }

  static LinkList insertionSortList(LinkList head) {
    LinkList curr = head;
    while (curr != null) {
      LinkList next = curr.next;
      while (next != null) {
        if (curr.val > next.val) {
          int temp = curr.val;
          curr.val = next.val;
          next.val = temp;
        }
        next = next.next;
      }
      curr = curr.next;
    }
    return head;
  }

  public static void main(String arg[]) {
    LinkList root = new LinkList(0);
    LinkList list0 = new LinkList(4, root);
    LinkList list1 = new LinkList(3, list0);
    // LinkList list2 = new LinkList(5, list1);
    // LinkList list3 = new LinkList(1, list2);
    // LinkList list4 = new LinkList(6, list3);
    insertionSortList(list1);
    // LinkList odd = list4, even = list4.next;
    // LinkList evenHead = even;
    // while (even != null && even.next != null) {
    // odd.next = even.next;
    // odd = odd.next;
    // even.next = odd.next;
    // even = even.next;
    // }
    // odd.next = evenHead;
  }
}
