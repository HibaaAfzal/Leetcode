// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    // Expected by the driver: build a list from a string like "[1,2,6,3]"
    public static ListNode deserialize(String s) {
        if (s == null) return null;
        s = s.trim();
        if (s.isEmpty() || s.equals("[]")) return null;

        // strip brackets if present
        if (s.charAt(0) == '[' && s.charAt(s.length() - 1) == ']') {
            s = s.substring(1, s.length() - 1);
        }
        if (s.trim().isEmpty()) return null;

        String[] parts = s.split(",");
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (String p : parts) {
            int v = Integer.parseInt(p.trim());
            tail.next = new ListNode(v);
            tail = tail.next;
        }
        return dummy.next;
    }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
