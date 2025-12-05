class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Move first ahead by n+1 steps
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both until first reaches end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove nth node
        second.next = second.next.next;

        return dummy.next;
    }
}
