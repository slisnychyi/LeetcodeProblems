package array;

import java.util.StringJoiner;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        System.out.println(new ReverseLinkedList().reverseList(head));
    }

    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    public ListNode reverseListIter(ListNode head) {
        ListNode newHead = null;
        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    ListNode reverse(ListNode prev, ListNode curr) {
        ListNode tmp = curr.next;
        curr = new ListNode(curr.val, prev);
        if (tmp != null) {
            return reverse(curr, tmp);
        } else {
            return curr;
        }
    }


    static class ListNode {
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

        @Override
        public String toString() {
            return new StringJoiner(", ", ListNode.class.getSimpleName() + "[", "]")
                    .add("val=" + val)
                    .add("next=" + next)
                    .toString();
        }
    }

}
