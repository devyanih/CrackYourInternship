/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        // find midnode
        ListNode slow= head,  fast= head;
    
        while( fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
       
        if(head == null || head.next== null){
            return true;
        }
        //reverse half
        ListNode prev=null;
        ListNode curr=slow;
        ListNode next;
        while(curr != null){
           next =curr.next;
           curr.next=prev;
            prev = curr;
            curr=next;
            // ListNode tmp =slow.next;
            // prev=slow;
            // slow=tmp;
            
        }
         // comapre
        
      
        while(prev != null){
    if(head.val != prev.val){
            return false;
        }
        head=head.next;
        prev=prev.next;
        }
        return true;
    }
}