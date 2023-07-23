class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode nextN = head.next;
        head.next = swapPairs(nextN.next);
        nextN.next = head;
        return nextN;
    }
}
