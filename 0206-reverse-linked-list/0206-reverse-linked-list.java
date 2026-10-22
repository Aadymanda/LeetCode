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
    public ListNode reverseList(ListNode head) {
        ListNode h1=null;
        ListNode l=head;
        while(l!=null){
            ListNode temp=l.next;
            l.next=h1;
            h1=l;
            l=temp;
            
            
        }
       
        return h1;


        
    }
}