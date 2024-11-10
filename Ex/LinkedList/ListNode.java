package LinkedList;

public class ListNode {
    final int val;   
    ListNode next;

    ListNode() {
        this.val = 0;
        this.next = null;
    }

    ListNode(int x) {
        this.val = x;
        this.next = null;
    }

    ListNode(int x, ListNode next) {
        this.val = x;
        this.next = next;
    }
}
