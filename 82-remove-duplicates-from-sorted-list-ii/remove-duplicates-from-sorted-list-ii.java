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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
            }
            ListNode temp=new ListNode();
            ListNode prev=head;
            ListNode ans=temp;
            while(prev!=null){
                if(prev.next!=null&&prev.val==prev.next.val){
                    while(prev.next!=null&&prev.val==prev.next.val){
                        prev=prev.next;
                    }
                    prev=prev.next;
                }
                else{
                    temp.next=prev;
                    temp=temp.next;
                    prev=prev.next;
                    temp.next=null;
                }
            }
            return ans.next;
    }
}