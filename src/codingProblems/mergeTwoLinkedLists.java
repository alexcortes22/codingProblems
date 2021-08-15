package codingProblems;

/**
 * Definition for singly-linked list.
 * 
 */
class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode result = dummy;
        
        ListNode p = l1;
        ListNode q = l2;
        
        while(p != null && q != null){
            if(p.val <= q.val){
                dummy.next = new ListNode(p.val);
                p = p.next;
                dummy = dummy.next;
            }else{
                dummy.next = new ListNode(q.val);
                q = q.next;
                dummy = dummy.next;
            }    
        }
        
        while(p != null){
            dummy.next = new ListNode(p.val);
            p = p.next;
            dummy = dummy.next;
        }
        
        while(q != null){
            dummy.next = new ListNode(q.val);
            q = q.next;
            dummy = dummy.next;
        }
    
        return result.next;
        
    }
}
