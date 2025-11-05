import java.lang.classfile.components.ClassPrinter;
import java.util.ArrayList;
import java.util.Collections;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class addTwoNumbers {

    public static void padListsLeft(ArrayList<Integer> a, ArrayList<Integer> b) {
        int maxSize = Math.max(a.size(), b.size());

        while (a.size() < maxSize) {
            a.add(0, 0); // add 0 at the beginning
        }
        while (b.size() < maxSize) {
            b.add(0, 0);
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        while (l1 != null) {
            al1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            al2.add(l2.val);
            l2 = l2.next;
        }

        // Reverse both lists to start from least significant digit
        Collections.reverse(al1);
        Collections.reverse(al2);
        padListsLeft(al1, al2);

        int carry = 0;
        ListNode head = null, tail = null;

        for (int i = 0; i < Math.max(al1.size(), al2.size()); i++) {
            int x = i < al1.size() ? al1.get(i) : 0;
            int y = i < al2.size() ? al2.get(i) : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            ListNode node = new ListNode(sum % 10);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        return head;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = addTwoNumbers(l1, l2);

        while(result!=null){
            System.out.print(result.val);
            result = result.next;
        }


    }
}
