class Solution {
    public static int size1(ListNode head) {
        int size=0;
        while(head!=null)
        {
            head=head.next;
            size++;
        }
        return size;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=curr;
        int count=0;
        int size=0;
        if(size1(head)<k && next!=null) {
           
           return next;
        }
        else {
            while(curr!=null && count<k ) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null)
            head.next=reverseKGroup(next,k);
        }
        return prev;    
    }
}
