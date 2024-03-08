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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null){
            return null;
        }
        ListNode temp=head;
        int cnt=0;
        
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(cnt==n){
            ListNode newhead=head.next;
            head=null;
            return newhead;
        }
        int cnt1=cnt-n;
        temp=head;
        while(temp!=null){
            cnt1--;
            if(cnt1==0){
                break;
            }
            temp=temp.next;
        }
        ListNode delNode=temp.next;
        temp.next=temp.next.next;
        delNode=null;
        return head;
    }
            
}