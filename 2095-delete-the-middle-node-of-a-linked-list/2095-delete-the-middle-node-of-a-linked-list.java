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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next==null)
            return null;
        
        ListNode temp=head;
        int size=0;
        int mid;
        int counter=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        mid=(size/2) ;
        
        while(temp!=null && temp.next!=null){
            
            if(counter+1==mid)
                temp.next=temp.next.next;
            temp=temp.next;
            counter++;
        }
        return head;
    }
}