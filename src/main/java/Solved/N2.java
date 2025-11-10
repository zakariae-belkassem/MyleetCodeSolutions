package Solved;

/**
 * Definition for singly-linked list.
 * */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class N2 {
    public static  void  padListsRight(ListNode a, ListNode b) {
        int lenA = getLength(a);
        int lenB = getLength(b);

        int maxSize = Math.max(lenA, lenB);

        padRight(a, maxSize - lenA);
        padRight(b, maxSize - lenB);

    }

    private static int getLength(ListNode node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    private static ListNode padRight(ListNode head, int padCount) {
        if (head == null) {
            head = new ListNode(0);
            padCount--;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        for (int i = 0; i < padCount; i++) {
            current.next = new ListNode(0);
            current = current.next;
        }

        return head;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        padListsRight(l1, l2);
        int carry = 0;
        ListNode result = new ListNode();
        ListNode head = result;
        while (l1 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            result.val = sum % 10;
            l1=l1.next;
            l2=l2.next;

            if (l1 != null || carry > 0) {
                result.next = new ListNode();
                result = result.next;
            }
        }
        if (carry > 0) {
            result.val = carry;
        }
        return head;
    }


}